package com.validation.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Payload;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PaymentValidation   {
	 String message() default "{org.hibernate.validator.referenceguide.chapter06." +
	            "crossparameter.ConsistentDateParameters.message}";

	    Class<?>[] groups() default { };

	    Class<? extends Payload>[] payload() default { };
}
