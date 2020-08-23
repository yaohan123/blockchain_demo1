package com.dce.blockchain.web.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSON;
import com.dce.blockchain.web.model.Block;
import com.dce.blockchain.web.model.Message;
import com.dce.blockchain.web.model.Transaction;
import com.dce.blockchain.web.util.BlockCache;
import com.dce.blockchain.web.util.BlockConstant;
import com.dce.blockchain.web.util.CommonUtil;

/**
 * 共识机制
 * 采用POW即工作量证明实现共识
 * @author yaohan
 *
 */
@Service
public class PowService {

	@Autowired
	BlockCache blockCache;
	
	@Autowired
	BlockService blockService;
	
	@Autowired
	P2PService p2PService;

	/**
	 * 通过“挖矿”进行工作量证明，实现节点间的共识
	 * @return
	 */
	public Block mine(){
		
		// 1、得到所有业务数据list（记录区块产生的节点信息，临时硬编码实现）
		List<Transaction> tsaList = new ArrayList<Transaction>();
			//第一个数据块，用来记录节点IP以及端口
		Transaction tsa1 = new Transaction();
		tsa1.setId("1");
		tsa1.setBusinessInfo("这是IP为："+CommonUtil.getLocalIp()+"，端口号为："+blockCache.getP2pport()+"的节点挖矿生成的区块");
		tsaList.add(tsa1);
			//第二个数据块，用来记录当前区块链高度
		Transaction tsa2 = new Transaction();
		tsa2.setId("2");
		tsa2.setBusinessInfo("区块链高度为："+(blockCache.getLatestBlock().getIndex()+1));
		tsaList.add(tsa2);
		
		// 2、计算哈希，挖矿
		String newBlockHash = "";
		int nonce = 0; //随机数初始为0
		long start = System.currentTimeMillis();
		System.out.println("开始挖矿");
		while (true) {
			// 得到所有块头信息后，计算新区块hash值
			newBlockHash = blockService.calculateHash(blockCache.getLatestBlock().getHash(), tsaList, nonce);
			// 挖矿是否成功，校验hash值
			if (blockService.isValidHash(newBlockHash)) {
				System.out.println("挖矿完成，正确的hash值：" + newBlockHash);
				System.out.println("挖矿耗费时间：" + (System.currentTimeMillis() - start) + "ms");
				break;
			}
			System.out.println("第"+(nonce+1)+"次尝试计算的hash值：" + newBlockHash);
			nonce++;
		}
		// 3、挖到矿，组成新区块，向全网广播这个新区块信息
		Block block = blockService.createNewBlock(nonce, blockCache.getLatestBlock().getHash(), newBlockHash, tsaList);
		
		// 4、全网广播
		Message msg = new Message();
		msg.setType(BlockConstant.RESPONSE_LATEST_BLOCK); //说明广播的类型
		msg.setData(JSON.toJSONString(block));
		p2PService.broatcast(JSON.toJSONString(msg));
		
		return block;
	}
	
}
