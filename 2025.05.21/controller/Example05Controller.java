package com.rabbit.Chap12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example05Controller {
	// 첫 링크목록 화면
	@GetMapping("/week12/exam01")
	public String requestMethod(Model model) {
		return "viewPage05";
	}
	
	@GetMapping("/home/main")
	public String requestMethod1(Model model) {
		model.addAttribute("data","homePage.html");
		return "homePage";
	}
	
	@GetMapping("/member/main")
	public String requestMethod2(Model model) {
		model.addAttribute("data", "memberPage.html");
		return "memberPage";
	}
}
