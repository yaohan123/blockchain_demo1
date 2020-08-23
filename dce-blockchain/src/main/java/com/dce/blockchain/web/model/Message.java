package com.dce.blockchain.web.model;

import java.io.Serializable;

/**
 * p2p通讯消息
 *
 * @author yaohan
 * 
 */
public class Message implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int type; //消息类型

	private String data; //消息内容

	public Message() {
	}

	public Message(int type) {
		this.type = type;
	}

	public Message(int type, String data) {
		this.type = type;
		this.data = data;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
