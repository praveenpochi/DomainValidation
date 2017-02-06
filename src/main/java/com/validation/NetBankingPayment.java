package com.validation;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class NetBankingPayment extends Payment{
	
	@NotNull(message="Payment type is manditory in NetBankingPayment")
	private String type;
	private String transactionDetails;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTransactionDetails() {
		return transactionDetails;
	}
	public void setTransactionDetails(String transactionDetails) {
		this.transactionDetails = transactionDetails;
	}
}
