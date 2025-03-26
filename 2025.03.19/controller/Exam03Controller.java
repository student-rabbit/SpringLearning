package com.rabbit.Chap03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping("/home")
public class Exam03Controller {
	
	@RequestMapping	 // localhost:8081/home
	public String requestMethod3() {
		return "viewPage03"; // viewPage03.html이 존재해야 한다.
	}
	
	@GetMapping("/exam04")  // localhost:8081/home/exam04
	public String requestMethod4() {
		return "viewPage04";
	}
	
	@RequestMapping("/exam05") // localhost:8081/home/exam05
	public @ResponseBody String requestMethod5() {
		return "veiwPage05";
	}
}
