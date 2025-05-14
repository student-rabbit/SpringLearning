package com.rabbit.Chap11.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rabbit.Chap11.domain.Product;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/ch09/exam01")
public class Example02Controller {
	// 입력 화면 + 기본값을 넣은 화면
	@GetMapping
	public String showForm(Model model) {
		Product product = new Product();
		product.setName("홍길동1");
		product.setPrice(10000);
		model.addAttribute("product", product);
		return "viewPage02";
	}
	
	// 출력화면 + 유효성 검사 실행
	@PostMapping
	public String submit(@Valid @ModelAttribute Product product, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "viewPage02";
		}
		return "viewPage02_result";
	}
}
