package com.rabbit.Chap13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/week13/exam06")
public class Example06Controller {
	@GetMapping
	public String ShowForm() {
		return "viewPage06";
	}
	
	@PostMapping
	// Requestparam, ModelAttribute 대신에 데이터를 바인딩해서 사용
	// 이름 = 값으로 전달
	public String submit(@RequestBody String param, Model model) {
		model.addAttribute("data1", "requestbody");
		model.addAttribute("data2", param);
		return "viewPage06_result";
	}
}
