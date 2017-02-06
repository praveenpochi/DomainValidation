package com.validation;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Component
public class DebitCardPayment extends Payment{
	
	@NotNull(message="Payment type is manditory in DebitCardPayment")
	private String type;
	private String cardDetails;
	private String securityCode;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCardDetails() {
		return cardDetails;
	}
	public void setCardDetails(String cardDetails) {
		this.cardDetails = cardDetails;
	}
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}


}
