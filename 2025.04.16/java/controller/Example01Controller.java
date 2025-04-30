package com.rabbit.Chap07.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rabbit.Chap07.domain.Member;

@Controller
public class Example01Controller {
	
	// 입력화면
	@GetMapping("/member")	//localhost:포트번호/member
	public String shoForm() {
		return "viewPage01";
	}
	
	// 출력화면(post)
	@PostMapping("/member")		// 가입버튼을 누르면 postMapping 통해 viewPage02가 보임.
	public String submitForm(@ModelAttribute Member member, Model model) {
		model.addAttribute("member", member);
		return "viewPage02";
	}
}
