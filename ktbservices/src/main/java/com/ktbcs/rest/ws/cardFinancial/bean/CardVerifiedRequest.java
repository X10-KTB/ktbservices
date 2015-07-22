package com.ktbcs.rest.ws.cardFinancial.bean;

import java.io.Serializable;
import java.util.Date;

public class CardVerifiedRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4591380146556492895L;
	
	private String agentId;
	private String cardNumber;
	private String cry; 
	private String customerId; 
	private String expireDate;
	private String password; 
	private String paymentService; 
	private String reference1;
	private String reference2;
	private String reference3;
	private Date referenceDate;
	private String resendFlag;
	private String securityCode;
	private String transactionReferenceId;
	private String transactionSubType;
	private String transactionType;
	private String username;
	
	public String getAgentId() {
		return agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCry() {
		return cry;
	}
	public void setCry(String cry) {
		this.cry = cry;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPaymentService() {
		return paymentService;
	}
	public void setPaymentService(String paymentService) {
		this.paymentService = paymentService;
	}
	public String getReference1() {
		return reference1;
	}
	public void setReference1(String reference1) {
		this.reference1 = reference1;
	}
	public String getReference2() {
		return reference2;
	}
	public void setReference2(String reference2) {
		this.reference2 = reference2;
	}
	public String getReference3() {
		return reference3;
	}
	public void setReference3(String reference3) {
		this.reference3 = reference3;
	}
	public Date getReferenceDate() {
		return referenceDate;
	}
	public void setReferenceDate(Date referenceDate) {
		this.referenceDate = referenceDate;
	}
	public String getResendFlag() {
		return resendFlag;
	}
	public void setResendFlag(String resendFlag) {
		this.resendFlag = resendFlag;
	}
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	public String getTransactionReferenceId() {
		return transactionReferenceId;
	}
	public void setTransactionReferenceId(String transactionReferenceId) {
		this.transactionReferenceId = transactionReferenceId;
	}
	public String getTransactionSubType() {
		return transactionSubType;
	}
	public void setTransactionSubType(String transactionSubType) {
		this.transactionSubType = transactionSubType;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
