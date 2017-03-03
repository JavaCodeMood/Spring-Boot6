package com.spring.domain;

/**
 * 服务器向浏览器发送的此类消息
 * @author dell
 *
 */
public class WiselyResponse {
	private String responseMessage;

	public WiselyResponse(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public String getResponseMessage() {
		return responseMessage;
	}
	
}
