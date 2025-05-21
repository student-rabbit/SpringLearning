package com.rabbit.Chap12.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rabbit.Chap12.domain.Person;
import com.rabbit.Chap12.domain.PersonValidator;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/week11/exam04")
public class Example04Controller {
	
	@Autowired	// 주입
	private PersonValidator personValidator;
	// 입력 화면 + 기본값을 넣은 화면
	@GetMapping
	public String showForm(Model model) {
		model.addAttribute("person", new Person());
		return "viewPage04";
	}
	
	// 출력화면 + 유효성 검사 실행
	@PostMapping
	public String submit(@Valid @ModelAttribute Person person, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "viewPage04";
		}
		return "viewPage04_result";
	}
	// 유효성 검사 설정 => 사용자가 정의한 것으로
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(personValidator);
	}
}
