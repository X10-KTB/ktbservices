package com.ktbcs.ws.ift.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Data implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4819404759660562442L;
	
	private String exchangeRate;
	private BigDecimal amount;
	private String chargeType;
	private BigDecimal feeAmount;
	private String effDate;
	
	public String getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getChargeType() {
		return chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public BigDecimal getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(BigDecimal feeAmount) {
		this.feeAmount = feeAmount;
	}
	public String getEffDate() {
		return effDate;
	}
	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}
}
