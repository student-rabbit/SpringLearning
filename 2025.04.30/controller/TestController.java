package com.rabbit.Chap09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.rabbit.Chap09.domain.Test;

@Controller
public class TestController {

	// 입력 화면
	@GetMapping("/test")
	public String inputform() {
		return "input";
	}
	
	// 출력 화면
	@PostMapping("/test")
	public String result(@ModelAttribute Test test, Model model) {  // 폼 태그 사용
		model.addAttribute("test", test); // 전달할 값
		return "result";
	}
}