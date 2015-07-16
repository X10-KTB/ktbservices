package com.ktb.verify;

import java.io.Serializable;

public class iftVerifyRequest implements Serializable{

	private static final long serialVersionUID = 4447971315977609199L;

	String TransSource;
	String TransRefNo;
	String TransDate;
	
	public String getTransSource() {
		return TransSource;
	}
	public void setTransSource(String transSource) {
		TransSource = transSource;
	}
	public String getTransRefNo() {
		return TransRefNo;
	}
	public void setTransRefNo(String transRefNo) {
		TransRefNo = transRefNo;
	}
	public String getTransDate() {
		return TransDate;
	}
	public void setTransDate(String transDate) {
		TransDate = transDate;
	}
	
	
}
