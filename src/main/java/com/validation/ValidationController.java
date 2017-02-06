package com.validation;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.validation.annotations.Employee;

@Controller
public class ValidationController {
	@InitBinder
	public void getPaymentType(WebDataBinder webBinder){
		
	}
	

	@Autowired
	private MessageSource messageSource;
	
	
	@RequestMapping(value = "validation/CHK", method = RequestMethod.POST)
	public String validateCHK(@Valid @RequestBody Employee emp,
			BindingResult result) {
		String message = "NoErrors";
		if (result.hasErrors()) {
			for (Object object : result.getAllErrors()) {
				if (object instanceof FieldError) {
					FieldError fieldError = (FieldError) object;
					message = messageSource.getMessage(fieldError, null);
					System.out.println(message);
				}
			}
		}
		return message;
	}
}
