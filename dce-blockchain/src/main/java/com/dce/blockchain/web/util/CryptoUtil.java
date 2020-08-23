package com.dce.blockchain.web.util;

import java.security.MessageDigest;
import java.util.UUID;
import org.springframework.util.DigestUtils;


/**
 * 密码学工具类
 * 
 * @author yaohan
 *
 */
public class CryptoUtil {

	/**
	 * SHA256散列函数
	 * @param str
	 * @return
	 */
	public static String SHA256(String str) {
		MessageDigest messageDigest; //Java自带的加密类MessageDigest类（加密MD5和SHA）
		String encodeStr = "";
		try {
			//1、对象初始化。得到指定算法的MessageDigest对象
			messageDigest = MessageDigest.getInstance("SHA-256");

			//2、更新数据。将输入字符串转化为字节数组，使用该byte数组更新摘要。
			messageDigest.update(str.getBytes("UTF-8")); //string.getBytes("utf-8")    public void update(byte[] input)

			//3、调用digest() 方法完成哈希计算
			encodeStr = byte2Hex(messageDigest.digest());//public byte[] digest() 通过执行诸如填充之类的最终操作完成哈希计算。在调用此方法之后，摘要被重置。
		} catch (Exception e) {
			System.out.println("getSHA256 is error" + e.getMessage());
		}
		return encodeStr;
	}
	
	private static String byte2Hex(byte[] bytes) {
		StringBuilder builder = new StringBuilder();
		String temp;
		for (int i = 0; i < bytes.length; i++) {
			temp = Integer.toHexString(bytes[i] & 0xFF);
			if (temp.length() == 1) {
				builder.append("0");
			}
			builder.append(temp);
		}
		return builder.toString();
	}

	public static String MD5(String str) {
		String resultStr = DigestUtils.md5DigestAsHex(str.getBytes());
		return resultStr.substring(4, resultStr.length());
	}

	public static String UUID() {
		return UUID.randomUUID().toString().replaceAll("\\-", "");
	}

}
