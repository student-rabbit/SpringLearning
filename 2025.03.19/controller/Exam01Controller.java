package com.rabbit.Chap03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Exam01Controller {
	
	@RequestMapping(value = "/exam01", method = RequestMethod.GET)
	public String requestmethod( ) {
		return "viewPage01";	// 뷰 리턴값: 리턴 문자열 + 확장자 찾음.(뷰 리졸버)
								// viewPage01.html을 찾아서 보여줌.
	} // end of requestmethod()
	
	@RequestMapping("/exam02_1")
	public @ResponseBody String requestMethod2() {
		return "viewPage02_1";
	} // end of requestMethod2
} // end of class