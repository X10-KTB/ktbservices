package com.ktbcs.rest.ws.cardFinancial.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.ktbcs.rest.ws.cardFinancial.bean.CardFinancialResponse;

@Path("/cardverify")
public class CardVerifiedFinancialService {
	
	@GET
    @Path("/card")
	public CardFinancialResponse verifies() {
		CardFinancialResponse response = new CardFinancialResponse();
		response.setBankRefId("220150707134913464");
		response.setResponseCode("IC000");
		response.setResponseDescription("Payment is Executed Successfully");
		response.setTransactionReferenceId("925974");
        return response;
    }
}
