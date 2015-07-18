package com.ktb.verify;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class cardVerifyRequest implements Serializable{

	private static final long serialVersionUID = 4035847300560862205L;

	String UserName;
	String PassWord;
	String PaymentService;
	String TransactionType;
	String TransactionSubType;
	Date ReferenceDate;
	String TransactionReferenceId;
	String AgentId;
	String CustomerId;
	String CardNumber;
	String ExpireDate;
	String SecurityCode;
	String CCY;
	String Reference1;
	String Reference2;
	String Reference3;
	String ResendFlag;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public String getPaymentService() {
		return PaymentService;
	}
	public void setPaymentService(String paymentService) {
		PaymentService = paymentService;
	}
	public String getTransactionType() {
		return TransactionType;
	}
	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}
	public String getTransactionSubType() {
		return TransactionSubType;
	}
	public void setTransactionSubType(String transactionSubType) {
		TransactionSubType = transactionSubType;
	}
	public Date getReferenceDate() {
		return ReferenceDate;
	}
	public void setReferenceDate(Date referenceDate) {
		ReferenceDate = referenceDate;
	}
	public String getTransactionReferenceId() {
		return TransactionReferenceId;
	}
	public void setTransactionReferenceId(String transactionReferenceId) {
		TransactionReferenceId = transactionReferenceId;
	}
	public String getAgentId() {
		return AgentId;
	}
	public void setAgentId(String agentId) {
		AgentId = agentId;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public String getExpireDate() {
		return ExpireDate;
	}
	public void setExpireDate(String expireDate) {
		ExpireDate = expireDate;
	}
	public String getSecurityCode() {
		return SecurityCode;
	}
	public void setSecurityCode(String securityCode) {
		SecurityCode = securityCode;
	}
	public String getCCY() {
		return CCY;
	}
	public void setCCY(String cCY) {
		CCY = cCY;
	}
	public String getReference1() {
		return Reference1;
	}
	public void setReference1(String reference1) {
		Reference1 = reference1;
	}
	public String getReference2() {
		return Reference2;
	}
	public void setReference2(String reference2) {
		Reference2 = reference2;
	}
	public String getReference3() {
		return Reference3;
	}
	public void setReference3(String reference3) {
		Reference3 = reference3;
	}
	public String getResendFlag() {
		return ResendFlag;
	}
	public void setResendFlag(String resendFlag) {
		ResendFlag = resendFlag;
	}
	
}