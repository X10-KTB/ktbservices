package com.ktb.verify;

import java.io.Serializable;

public class cardVerifyResponse implements Serializable{

	private static final long serialVersionUID = 3788834532593766525L;

	String authorizationIDResp;
	String bankRefId;
	String information1;
	String information2;
	String information3;
	String information4;
	String responseCode;
	String responseDescription;
	String transactionReferenceId;
	public String getAuthorizationIDResp() {
		return authorizationIDResp;
	}
	public void setAuthorizationIDResp(String authorizationIDResp) {
		this.authorizationIDResp = authorizationIDResp;
	}
	public String getBankRefId() {
		return bankRefId;
	}
	public void setBankRefId(String bankRefId) {
		this.bankRefId = bankRefId;
	}
	public String getInformation1() {
		return information1;
	}
	public void setInformation1(String information1) {
		this.information1 = information1;
	}
	public String getInformation2() {
		return information2;
	}
	public void setInformation2(String information2) {
		this.information2 = information2;
	}
	public String getInformation3() {
		return information3;
	}
	public void setInformation3(String information3) {
		this.information3 = information3;
	}
	public String getInformation4() {
		return information4;
	}
	public void setInformation4(String information4) {
		this.information4 = information4;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDescription() {
		return responseDescription;
	}
	public void setResponseDescription(String responseDescription) {
		this.responseDescription = responseDescription;
	}
	public String getTransactionReferenceId() {
		return transactionReferenceId;
	}
	public void setTransactionReferenceId(String transactionReferenceId) {
		this.transactionReferenceId = transactionReferenceId;
	}
	
	
	
	
}
