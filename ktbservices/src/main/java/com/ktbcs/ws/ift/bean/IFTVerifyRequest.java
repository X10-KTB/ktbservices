package com.ktbcs.ws.ift.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class IFTVerifyRequest implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4725919343932855979L;
	
	private String transSource;
	private String transRefNo;
	private String transDate;
	private String transTime;
	private String termID;
	private String userID; 
	private BigDecimal Amount;
	private String currency;
	private String exchangeTy;
	private String chargeType;
	private String exchangeRate;
	private String orderingType;
	private String orderingCustomerID;
	private String orderingNameThai;
	private String orderingId;
	private String orderingAcct;
	private String orderingBranch;
	private String orderingBank;
	private String orderingBic;
	private String orderingName;
	private String orderingAddr1;
	private String orderingAddr2;
	private String orderingAddr3;
	private String orderingPhone;
	private String orderingFax;
	private String orderingMobile;
	private String orderingEmail;
	private String orderingCurrency;
	private BigDecimal orderingAmount;
	private String benAcct;
	private String benName;
	private String benAddr1;
	private String benAddr2;
	private String benAddr3;
	private String benPhone;
	private String benEmail;
	private String benCountry;
	private String benCountryName;
	private String benBic;
	private String benBankName;
	private String benBranchName;
	private String benAddress1;
	private String benAddress2;
	private String benAddress3;
	private String otherPartyEmail;
	private String effDate;
	private String purposeCode;
	private String purposeDescription;
	private String remitInfo1;
	private String remitInfo2;
	private String remitInfo3;
	private String remitInfo4;
	private String iftRemark;
	private String cifId;
	private List<FwdRate> fwdRateList;
	private List<AttachDoc> attachDocList;
	public String getTransSource() {
		return transSource;
	}
	public void setTransSource(String transSource) {
		this.transSource = transSource;
	}
	public String getTransRefNo() {
		return transRefNo;
	}
	public void setTransRefNo(String transRefNo) {
		this.transRefNo = transRefNo;
	}
	public String getTransDate() {
		return transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public String getTransTime() {
		return transTime;
	}
	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}
	public String getTermID() {
		return termID;
	}
	public void setTermID(String termID) {
		this.termID = termID;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public BigDecimal getAmount() {
		return Amount;
	}
	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getExchangeTy() {
		return exchangeTy;
	}
	public void setExchangeTy(String exchangeTy) {
		this.exchangeTy = exchangeTy;
	}
	public String getChargeType() {
		return chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public String getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getOrderingType() {
		return orderingType;
	}
	public void setOrderingType(String orderingType) {
		this.orderingType = orderingType;
	}
	public String getOrderingCustomerID() {
		return orderingCustomerID;
	}
	public void setOrderingCustomerID(String orderingCustomerID) {
		this.orderingCustomerID = orderingCustomerID;
	}
	public String getOrderingNameThai() {
		return orderingNameThai;
	}
	public void setOrderingNameThai(String orderingNameThai) {
		this.orderingNameThai = orderingNameThai;
	}
	public String getOrderingId() {
		return orderingId;
	}
	public void setOrderingId(String orderingId) {
		this.orderingId = orderingId;
	}
	public String getOrderingAcct() {
		return orderingAcct;
	}
	public void setOrderingAcct(String orderingAcct) {
		this.orderingAcct = orderingAcct;
	}
	public String getOrderingBranch() {
		return orderingBranch;
	}
	public void setOrderingBranch(String orderingBranch) {
		this.orderingBranch = orderingBranch;
	}
	public String getOrderingBank() {
		return orderingBank;
	}
	public void setOrderingBank(String orderingBank) {
		this.orderingBank = orderingBank;
	}
	public String getOrderingBic() {
		return orderingBic;
	}
	public void setOrderingBic(String orderingBic) {
		this.orderingBic = orderingBic;
	}
	public String getOrderingName() {
		return orderingName;
	}
	public void setOrderingName(String orderingName) {
		this.orderingName = orderingName;
	}
	public String getOrderingAddr1() {
		return orderingAddr1;
	}
	public void setOrderingAddr1(String orderingAddr1) {
		this.orderingAddr1 = orderingAddr1;
	}
	public String getOrderingAddr2() {
		return orderingAddr2;
	}
	public void setOrderingAddr2(String orderingAddr2) {
		this.orderingAddr2 = orderingAddr2;
	}
	public String getOrderingAddr3() {
		return orderingAddr3;
	}
	public void setOrderingAddr3(String orderingAddr3) {
		this.orderingAddr3 = orderingAddr3;
	}
	public String getOrderingPhone() {
		return orderingPhone;
	}
	public void setOrderingPhone(String orderingPhone) {
		this.orderingPhone = orderingPhone;
	}
	public String getOrderingFax() {
		return orderingFax;
	}
	public void setOrderingFax(String orderingFax) {
		this.orderingFax = orderingFax;
	}
	public String getOrderingMobile() {
		return orderingMobile;
	}
	public void setOrderingMobile(String orderingMobile) {
		this.orderingMobile = orderingMobile;
	}
	public String getOrderingEmail() {
		return orderingEmail;
	}
	public void setOrderingEmail(String orderingEmail) {
		this.orderingEmail = orderingEmail;
	}
	public String getOrderingCurrency() {
		return orderingCurrency;
	}
	public void setOrderingCurrency(String orderingCurrency) {
		this.orderingCurrency = orderingCurrency;
	}
	public BigDecimal getOrderingAmount() {
		return orderingAmount;
	}
	public void setOrderingAmount(BigDecimal orderingAmount) {
		this.orderingAmount = orderingAmount;
	}
	public String getBenAcct() {
		return benAcct;
	}
	public void setBenAcct(String benAcct) {
		this.benAcct = benAcct;
	}
	public String getBenName() {
		return benName;
	}
	public void setBenName(String benName) {
		this.benName = benName;
	}
	public String getBenAddr1() {
		return benAddr1;
	}
	public void setBenAddr1(String benAddr1) {
		this.benAddr1 = benAddr1;
	}
	public String getBenAddr2() {
		return benAddr2;
	}
	public void setBenAddr2(String benAddr2) {
		this.benAddr2 = benAddr2;
	}
	public String getBenAddr3() {
		return benAddr3;
	}
	public void setBenAddr3(String benAddr3) {
		this.benAddr3 = benAddr3;
	}
	public String getBenPhone() {
		return benPhone;
	}
	public void setBenPhone(String benPhone) {
		this.benPhone = benPhone;
	}
	public String getBenEmail() {
		return benEmail;
	}
	public void setBenEmail(String benEmail) {
		this.benEmail = benEmail;
	}
	public String getBenCountry() {
		return benCountry;
	}
	public void setBenCountry(String benCountry) {
		this.benCountry = benCountry;
	}
	public String getBenCountryName() {
		return benCountryName;
	}
	public void setBenCountryName(String benCountryName) {
		this.benCountryName = benCountryName;
	}
	public String getBenBic() {
		return benBic;
	}
	public void setBenBic(String benBic) {
		this.benBic = benBic;
	}
	public String getBenBankName() {
		return benBankName;
	}
	public void setBenBankName(String benBankName) {
		this.benBankName = benBankName;
	}
	public String getBenBranchName() {
		return benBranchName;
	}
	public void setBenBranchName(String benBranchName) {
		this.benBranchName = benBranchName;
	}
	public String getBenAddress1() {
		return benAddress1;
	}
	public void setBenAddress1(String benAddress1) {
		this.benAddress1 = benAddress1;
	}
	public String getBenAddress2() {
		return benAddress2;
	}
	public void setBenAddress2(String benAddress2) {
		this.benAddress2 = benAddress2;
	}
	public String getBenAddress3() {
		return benAddress3;
	}
	public void setBenAddress3(String benAddress3) {
		this.benAddress3 = benAddress3;
	}
	public String getOtherPartyEmail() {
		return otherPartyEmail;
	}
	public void setOtherPartyEmail(String otherPartyEmail) {
		this.otherPartyEmail = otherPartyEmail;
	}
	public String getEffDate() {
		return effDate;
	}
	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}
	public String getPurposeCode() {
		return purposeCode;
	}
	public void setPurposeCode(String purposeCode) {
		this.purposeCode = purposeCode;
	}
	public String getPurposeDescription() {
		return purposeDescription;
	}
	public void setPurposeDescription(String purposeDescription) {
		this.purposeDescription = purposeDescription;
	}
	public String getRemitInfo1() {
		return remitInfo1;
	}
	public void setRemitInfo1(String remitInfo1) {
		this.remitInfo1 = remitInfo1;
	}
	public String getRemitInfo2() {
		return remitInfo2;
	}
	public void setRemitInfo2(String remitInfo2) {
		this.remitInfo2 = remitInfo2;
	}
	public String getRemitInfo3() {
		return remitInfo3;
	}
	public void setRemitInfo3(String remitInfo3) {
		this.remitInfo3 = remitInfo3;
	}
	public String getRemitInfo4() {
		return remitInfo4;
	}
	public void setRemitInfo4(String remitInfo4) {
		this.remitInfo4 = remitInfo4;
	}
	public String getIftRemark() {
		return iftRemark;
	}
	public void setIftRemark(String iftRemark) {
		this.iftRemark = iftRemark;
	}
	public String getCifId() {
		return cifId;
	}
	public void setCifId(String cifId) {
		this.cifId = cifId;
	}
	public List<FwdRate> getFwdRateList() {
		return fwdRateList;
	}
	public void setFwdRateList(List<FwdRate> fwdRateList) {
		this.fwdRateList = fwdRateList;
	}
	public List<AttachDoc> getAttachDocList() {
		return attachDocList;
	}
	public void setAttachDocList(List<AttachDoc> attachDocList) {
		this.attachDocList = attachDocList;
	}
}
