package com.rabbit.Chap12.domain;

import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class PersonValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Person.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// 유효성 검사 실행할 항목
		Person person = (Person) target;
		if(person.getName() == null || person.getName().trim().isEmpty()) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null, "이름을 입력하세요.");
		}
		if(person.getAge() == null || person.getAge().trim().isEmpty()) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", null, "나이를 입력하세요.");
		}
		if(person.getEmail() == null || person.getEmail().trim().isEmpty()) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", null, "이메일을 입력하세요.");
		}
	}
}