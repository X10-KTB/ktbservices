package com.ktb.verify;

import java.io.Serializable;
import java.math.BigDecimal;

public class iftVerifyResponse implements Serializable{

	private static final long serialVersionUID = 4447971315977609199L;

	String ResponseCode;
	String ResponseDesc;
	String Data;
	BigDecimal ExchangeRate;
	String Amount;
	String ChargeType;
	BigDecimal FeeAmount;
	String EffDate;
	
	public String getResponseCode() {
		return ResponseCode;
	}
	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}
	public String getResponseDesc() {
		return ResponseDesc;
	}
	public void setResponseDesc(String responseDesc) {
		ResponseDesc = responseDesc;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public BigDecimal getExchangeRate() {
		return ExchangeRate;
	}
	public void setExchangeRate(BigDecimal exchangeRate) {
		ExchangeRate = exchangeRate;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getChargeType() {
		return ChargeType;
	}
	public void setChargeType(String chargeType) {
		ChargeType = chargeType;
	}
	public BigDecimal getFeeAmount() {
		return FeeAmount;
	}
	public void setFeeAmount(BigDecimal feeAmount) {
		FeeAmount = feeAmount;
	}
	public String getEffDate() {
		return EffDate;
	}
	public void setEffDate(String effDate) {
		EffDate = effDate;
	}
	
}
