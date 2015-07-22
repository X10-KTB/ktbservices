package com.ktbcs.ws.ift.bean;

import java.io.Serializable;

public class IFTVerifyResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8013248624292792916L;

	private String responseCode;
	private String responseDesc;
	private Data data;
	
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDesc() {
		return responseDesc;
	}
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
}
