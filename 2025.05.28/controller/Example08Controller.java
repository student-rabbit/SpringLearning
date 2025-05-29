package com.rabbit.Chap13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.Chap13.domain.Person;

@RestController
@RequestMapping("/week13/exam08")
public class Example08Controller {
	
	@GetMapping
	public Person submit() {
		Person person = new Person();
		person.setName("홍길동");
		person.setAge("20");
		person.setEmail("test@test.com");
		return person;
	}
}
