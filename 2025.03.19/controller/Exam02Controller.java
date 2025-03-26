package com.rabbit.Chap03.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	//@Controller + @ResponseBody
public class Exam02Controller {
	
	@RequestMapping("/exam02")
	public String reqestMethod1() {
		return "ViewPage02";	// 리턴되는 값을 브라우저에 문자로 출력
	}
	
} // end of class