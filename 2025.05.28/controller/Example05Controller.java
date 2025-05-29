package com.rabbit.Chap13.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Example05Controller {
	@GetMapping("/week13/exam05") // 로그인
	public String requestMethod1(Model model) {
		return "viewPage05";
	}
	
	@GetMapping("/admin") // 로그인 성공
	public String requestMethod2(Authentication user, Model model) {
		model.addAttribute("data", user.getName());
		return "viewPage05_result";
	}
	@GetMapping("/week13/logout") // 로그아웃
	public String logout(Model model) {
		return "viewPage05";
	}
}