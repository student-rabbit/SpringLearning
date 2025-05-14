package com.rabbit.Chap11.domain;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MemberIdValidator implements ConstraintValidator<MemberId, String> {

	public void initialize(MemberId constrantAnnotation) {
		ConstraintValidator.super.initialize(constrantAnnotation);
	}
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value.equals("admin")) {
			return false;
		}
		return true;
	}

}