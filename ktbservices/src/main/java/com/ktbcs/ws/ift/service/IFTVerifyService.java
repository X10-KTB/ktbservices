package com.ktbcs.ws.ift.service;

import java.math.BigDecimal;

import com.ktbcs.ws.ift.bean.Data;
import com.ktbcs.ws.ift.bean.IFTVerifyRequest;
import com.ktbcs.ws.ift.bean.IFTVerifyResponse;

public class IFTVerifyService {
	
	public IFTVerifyResponse iftVerify(IFTVerifyRequest request) {
		
		IFTVerifyResponse response = new IFTVerifyResponse();
		response.setResponseCode("00000");
		response.setResponseDesc("Success");
		
		Data data = new Data();
		data.setExchangeRate("32.6400000");
		data.setAmount(new BigDecimal("61.27"));
		data.setChargeType("BEN");
		data.setFeeAmount(new BigDecimal("150"));
		data.setEffDate("20150707");
		
		response.setData(data);
		
		return response;
	}
}
