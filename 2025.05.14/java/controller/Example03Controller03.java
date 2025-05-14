package com.rabbit.Chap11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rabbit.Chap11.domain.Member1;
import com.rabbit.Chap11.domain.Product;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/ch09/exam03")
public class Example03Controller03 {
	// 입력 화면 + 기본값을 넣은 화면
	@GetMapping
	public String showForm(Model model) {
		model.addAttribute("member1", new Member1());
		return "viewPage03";
	}
	
	// 출력화면 + 유효성 검사 실행
	@PostMapping
	public String submit(@Valid @ModelAttribute Member1 member1, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "viewPage03";
		}
		return "viewPage03_result";
	}
}
