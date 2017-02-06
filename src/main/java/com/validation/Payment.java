package com.validation;

import javax.validation.constraints.NotNull;

public class Payment {
	
	@NotNull(message = "cardName is manditory")
	private String cardName ;

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

}
