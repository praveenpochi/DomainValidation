package com.validation.annotations;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.group.GroupSequenceProvider;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.validation.Payment;
import com.validation.ValidationGroups;
import com.validation.ValidationGroups.ValidateACH;
import com.validation.ValidationGroups.ValidateCA;
import com.validation.ValidationGroups.ValidateCHK;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("unused")
@Component
@GroupSequenceProvider(MyCustomSequenceProvider.class)
@JsonInclude(Include.NON_NULL)
public class Employee {

	@NotNull(groups = {ValidationGroups.ValidateCHK.class}, message = "name is manditory")
	@JsonProperty("name")
	private String name;
	/*
	 * private double sal; private int id ;
	 */

	@NotNull(groups = {ValidationGroups.ValidateCHK.class }, message = "Payment type is manditory in CreditCardPayment")
	@JsonProperty("type")
	private String type;
	
	
	@Valid @NotNull(groups = { ValidationGroups.ValidateCHK.class })
	private Payment chkPayment;

	@Valid @NotNull(groups = { ValidationGroups.ValidateCA.class })
	private Payment caPayment;

	@Valid
	@NotNull(groups = { ValidationGroups.ValidateACH.class })
	private Payment achPayment;

	public String getType() {
		return type;
	}

	public Payment getChkPayment() {
		return chkPayment;
	}

	public void setChkPayment(Payment chkPayment) {
		this.chkPayment = chkPayment;
	}

	public Payment getCaPayment() {
		return caPayment;
	}

	public void setCaPayment(Payment caPayment) {
		this.caPayment = caPayment;
	}

	public Payment getAchPayment() {
		return achPayment;
	}

	public void setAchPayment(Payment achPayment) {
		this.achPayment = achPayment;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
