package com.ktbcs.ws.ift.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class FwdRate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2194547956388174924L;

	private Integer fwdRateSeqNo;
	private String dealNo;
	private String fwdRateCurrency;
	private BigDecimal limitAmount;
	private BigDecimal useAmount;
	private String fwdRate;
	private String offerRateType;
	private String expireDate;
	private String exchangeAmount;
	
	public Integer getFwdRateSeqNo() {
		return fwdRateSeqNo;
	}
	public void setFwdRateSeqNo(Integer fwdRateSeqNo) {
		this.fwdRateSeqNo = fwdRateSeqNo;
	}
	public String getDealNo() {
		return dealNo;
	}
	public void setDealNo(String dealNo) {
		this.dealNo = dealNo;
	}
	public String getFwdRateCurrency() {
		return fwdRateCurrency;
	}
	public void setFwdRateCurrency(String fwdRateCurrency) {
		this.fwdRateCurrency = fwdRateCurrency;
	}
	public BigDecimal getLimitAmount() {
		return limitAmount;
	}
	public void setLimitAmount(BigDecimal limitAmount) {
		this.limitAmount = limitAmount;
	}
	public BigDecimal getUseAmount() {
		return useAmount;
	}
	public void setUseAmount(BigDecimal useAmount) {
		this.useAmount = useAmount;
	}
	public String getFwdRate() {
		return fwdRate;
	}
	public void setFwdRate(String fwdRate) {
		this.fwdRate = fwdRate;
	}
	public String getOfferRateType() {
		return offerRateType;
	}
	public void setOfferRateType(String offerRateType) {
		this.offerRateType = offerRateType;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public String getExchangeAmount() {
		return exchangeAmount;
	}
	public void setExchangeAmount(String exchangeAmount) {
		this.exchangeAmount = exchangeAmount;
	}
}
