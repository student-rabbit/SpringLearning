package com.rabbit.Chap08review.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class Exam {
	// lobalhost: 포트번호/exam
	@GetMapping("/exam")
	public String exam1(Model model) {
		model.addAttribute("name", "<h3>Exam Text</h3>");
		return "exam01";
	}
	
	// lobalhost: 포트번호/exam
	@GetMapping("/exam/{id}")
	public String exam2(@PathVariable("id") String examid, Model model) {
		model.addAttribute("id", examid);
		return "exam02";
	}
}
