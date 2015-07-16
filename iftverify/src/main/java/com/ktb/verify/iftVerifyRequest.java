package com.ktb.verify;

import java.io.Serializable;
import java.math.BigDecimal;

public class iftVerifyRequest implements Serializable{

	private static final long serialVersionUID = 4447971315977609199L;

	String TransSource;
	String TransRefNo;
	String TransDate;
	String TransTime;
	String TemID;
	String UserID;
	BigDecimal Amount;
	String Currency;
	String ExchangeType;
	String ChargeType;
	String ExchangeRate;
	String OrderingType;
	String OrderingCustomerID;
	String OrderingNameThai ;
	String OrderingId ;
	String OrderingAcct ;
	String OrderingBranch ;
	String OrderingBank ;
	String OrderingBic ;
	String OrderingName ;
	String OrderingAddr1 ;
	String OrderingAddr2 ;
	String OrderingAddr3 ;
	String OrderingPhone ;
	String OrderingFax ;
	String OrderingMobile ;
	String OrderingEmail ;
	String OrderingCurrency ;
	BigDecimal OrderingAmount ;
	String BenAcct ;
	String BenName ;
	String BenAddr1 ;
	String BenAddr2 ;
	String BenAddr3 ;
	String BenPhone ;
	String BenEmail ;
	String BenCountry ;
	String BenCountryName ;
	String BenBic ;
	String BenBankName ;
	String BenBranchName ;
	String BenAddress1 ;
	String BenAddress2 ;
	String BenAddress3 ;
	String OtherPartyEmail ;
	String EffDate ;
	String PurposeCode ;
	String PurposeDescription ;
	String RemitInfo1 ;
	String RemitInfo2 ;
	String RemitInfo3 ;
	String RemitInfo4 ;
	String IftRemark ;
	String CifId ;
	String FwdRateList ;
	String FwdRateSeqNo ;
	String DealNo ;
	String FwdRateCurrency ;
	String LimitAmount ;
	String UseAmount ;
//	String FwdRate ;
//	String OfferRateType ;
//	String ExpireDate ;
//	String ExchangeAmount ;
//	String AttachDocList ;
//	String DocSeqID ;
//	String ChronicleID ;
//	String FileName ;
//	String DocType ;
//	String DocVersion ;
	
	
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
	public String getTransTime() {
		return TransTime;
	}
	public void setTransTime(String transTime) {
		TransTime = transTime;
	}
	public String getTemID() {
		return TemID;
	}
	public void setTemID(String temID) {
		TemID = temID;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public BigDecimal getAmount() {
		return Amount;
	}
	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}
	public String getCurrency() {
		return Currency;
	}
	public void setCurrency(String currency) {
		Currency = currency;
	}
	public String getExchangeType() {
		return ExchangeType;
	}
	public void setExchangeType(String exchangeType) {
		ExchangeType = exchangeType;
	}
	public String getChargeType() {
		return ChargeType;
	}
	public void setChargeType(String chargeType) {
		ChargeType = chargeType;
	}
	public String getExchangeRate() {
		return ExchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		ExchangeRate = exchangeRate;
	}
	public String getOrderingType() {
		return OrderingType;
	}
	public void setOrderingType(String orderingType) {
		OrderingType = orderingType;
	}
	public String getOrderingCustomerID() {
		return OrderingCustomerID;
	}
	public void setOrderingCustomerID(String orderingCustomerID) {
		OrderingCustomerID = orderingCustomerID;
	}
	public String getOrderingNameThai() {
		return OrderingNameThai;
	}
	public void setOrderingNameThai(String orderingNameThai) {
		OrderingNameThai = orderingNameThai;
	}
	public String getOrderingId() {
		return OrderingId;
	}
	public void setOrderingId(String orderingId) {
		OrderingId = orderingId;
	}
	public String getOrderingAcct() {
		return OrderingAcct;
	}
	public void setOrderingAcct(String orderingAcct) {
		OrderingAcct = orderingAcct;
	}
	public String getOrderingBranch() {
		return OrderingBranch;
	}
	public void setOrderingBranch(String orderingBranch) {
		OrderingBranch = orderingBranch;
	}
	public String getOrderingBank() {
		return OrderingBank;
	}
	public void setOrderingBank(String orderingBank) {
		OrderingBank = orderingBank;
	}
	public String getOrderingBic() {
		return OrderingBic;
	}
	public void setOrderingBic(String orderingBic) {
		OrderingBic = orderingBic;
	}
	public String getOrderingName() {
		return OrderingName;
	}
	public void setOrderingName(String orderingName) {
		OrderingName = orderingName;
	}
	public String getOrderingAddr1() {
		return OrderingAddr1;
	}
	public void setOrderingAddr1(String orderingAddr1) {
		OrderingAddr1 = orderingAddr1;
	}
	public String getOrderingAddr2() {
		return OrderingAddr2;
	}
	public void setOrderingAddr2(String orderingAddr2) {
		OrderingAddr2 = orderingAddr2;
	}
	public String getOrderingAddr3() {
		return OrderingAddr3;
	}
	public void setOrderingAddr3(String orderingAddr3) {
		OrderingAddr3 = orderingAddr3;
	}
	public String getOrderingPhone() {
		return OrderingPhone;
	}
	public void setOrderingPhone(String orderingPhone) {
		OrderingPhone = orderingPhone;
	}
	public String getOrderingFax() {
		return OrderingFax;
	}
	public void setOrderingFax(String orderingFax) {
		OrderingFax = orderingFax;
	}
	public String getOrderingMobile() {
		return OrderingMobile;
	}
	public void setOrderingMobile(String orderingMobile) {
		OrderingMobile = orderingMobile;
	}
	public String getOrderingEmail() {
		return OrderingEmail;
	}
	public void setOrderingEmail(String orderingEmail) {
		OrderingEmail = orderingEmail;
	}
	public String getOrderingCurrency() {
		return OrderingCurrency;
	}
	public void setOrderingCurrency(String orderingCurrency) {
		OrderingCurrency = orderingCurrency;
	}
	public BigDecimal getOrderingAmount() {
		return OrderingAmount;
	}
	public void setOrderingAmount(BigDecimal orderingAmount) {
		OrderingAmount = orderingAmount;
	}
	public String getBenAcct() {
		return BenAcct;
	}
	public void setBenAcct(String benAcct) {
		BenAcct = benAcct;
	}
	public String getBenName() {
		return BenName;
	}
	public void setBenName(String benName) {
		BenName = benName;
	}
	public String getBenAddr1() {
		return BenAddr1;
	}
	public void setBenAddr1(String benAddr1) {
		BenAddr1 = benAddr1;
	}
	public String getBenAddr2() {
		return BenAddr2;
	}
	public void setBenAddr2(String benAddr2) {
		BenAddr2 = benAddr2;
	}
	public String getBenAddr3() {
		return BenAddr3;
	}
	public void setBenAddr3(String benAddr3) {
		BenAddr3 = benAddr3;
	}
	public String getBenPhone() {
		return BenPhone;
	}
	public void setBenPhone(String benPhone) {
		BenPhone = benPhone;
	}
	public String getBenEmail() {
		return BenEmail;
	}
	public void setBenEmail(String benEmail) {
		BenEmail = benEmail;
	}
	public String getBenCountry() {
		return BenCountry;
	}
	public void setBenCountry(String benCountry) {
		BenCountry = benCountry;
	}
	public String getBenCountryName() {
		return BenCountryName;
	}
	public void setBenCountryName(String benCountryName) {
		BenCountryName = benCountryName;
	}
	public String getBenBic() {
		return BenBic;
	}
	public void setBenBic(String benBic) {
		BenBic = benBic;
	}
	public String getBenBankName() {
		return BenBankName;
	}
	public void setBenBankName(String benBankName) {
		BenBankName = benBankName;
	}
	public String getBenBranchName() {
		return BenBranchName;
	}
	public void setBenBranchName(String benBranchName) {
		BenBranchName = benBranchName;
	}
	public String getBenAddress1() {
		return BenAddress1;
	}
	public void setBenAddress1(String benAddress1) {
		BenAddress1 = benAddress1;
	}
	public String getBenAddress2() {
		return BenAddress2;
	}
	public void setBenAddress2(String benAddress2) {
		BenAddress2 = benAddress2;
	}
	public String getBenAddress3() {
		return BenAddress3;
	}
	public void setBenAddress3(String benAddress3) {
		BenAddress3 = benAddress3;
	}
	public String getOtherPartyEmail() {
		return OtherPartyEmail;
	}
	public void setOtherPartyEmail(String otherPartyEmail) {
		OtherPartyEmail = otherPartyEmail;
	}
	public String getEffDate() {
		return EffDate;
	}
	public void setEffDate(String effDate) {
		EffDate = effDate;
	}
	public String getPurposeCode() {
		return PurposeCode;
	}
	public void setPurposeCode(String purposeCode) {
		PurposeCode = purposeCode;
	}
	public String getPurposeDescription() {
		return PurposeDescription;
	}
	public void setPurposeDescription(String purposeDescription) {
		PurposeDescription = purposeDescription;
	}
	public String getRemitInfo1() {
		return RemitInfo1;
	}
	public void setRemitInfo1(String remitInfo1) {
		RemitInfo1 = remitInfo1;
	}
	public String getRemitInfo2() {
		return RemitInfo2;
	}
	public void setRemitInfo2(String remitInfo2) {
		RemitInfo2 = remitInfo2;
	}
	public String getRemitInfo3() {
		return RemitInfo3;
	}
	public void setRemitInfo3(String remitInfo3) {
		RemitInfo3 = remitInfo3;
	}
	public String getRemitInfo4() {
		return RemitInfo4;
	}
	public void setRemitInfo4(String remitInfo4) {
		RemitInfo4 = remitInfo4;
	}
	public String getIftRemark() {
		return IftRemark;
	}
	public void setIftRemark(String iftRemark) {
		IftRemark = iftRemark;
	}
	public String getCifId() {
		return CifId;
	}
	public void setCifId(String cifId) {
		CifId = cifId;
	}
	public String getFwdRateList() {
		return FwdRateList;
	}
	public void setFwdRateList(String fwdRateList) {
		FwdRateList = fwdRateList;
	}
	public String getFwdRateSeqNo() {
		return FwdRateSeqNo;
	}
	public void setFwdRateSeqNo(String fwdRateSeqNo) {
		FwdRateSeqNo = fwdRateSeqNo;
	}
	public String getDealNo() {
		return DealNo;
	}
	public void setDealNo(String dealNo) {
		DealNo = dealNo;
	}
	public String getFwdRateCurrency() {
		return FwdRateCurrency;
	}
	public void setFwdRateCurrency(String fwdRateCurrency) {
		FwdRateCurrency = fwdRateCurrency;
	}
	public String getLimitAmount() {
		return LimitAmount;
	}
	public void setLimitAmount(String limitAmount) {
		LimitAmount = limitAmount;
	}
	public String getUseAmount() {
		return UseAmount;
	}
	public void setUseAmount(String useAmount) {
		UseAmount = useAmount;
	}
	
	
}
