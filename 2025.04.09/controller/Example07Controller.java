package com.rabbit.Chap06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Example07Controller {

	// @RequestParam
	// localhost:포트번호/ch5/exam01?id=admin&passwd=admin1234
	@GetMapping("/ch5/exam01")  
	public String reqestMethod1(@RequestParam("id") String userId,
			@RequestParam("passwd") String userPw, Model model) {
		
		model.addAttribute("data1", "requestparam 예제");
		model.addAttribute("data2", "요청 id: " + userId + "<br>요청비번: " +userPw);
		return "viewPage07";
	}
	
	// id값 미 입력 _ 관리자라고 자동 입력: defaultValue
	// localhost:포트번호/ch5/exam02?id&passwd=admin1234
	@GetMapping("/ch5/exam02")   
	public String reqestMethod2(@RequestParam(value = "id", defaultValue = "관리자") String userId,
			@RequestParam("passwd") String userPw, Model model) {
		
		model.addAttribute("data1", "requestparam 예제");
		model.addAttribute("data2", "요청 id: " + userId + "<br>요청비번: " +userPw);
		return "viewPage07";
	}
//---------------------------------------
	// @PathVariable
	// id값 미 입력 _ 관리자라고 자동 입력: defaultValue
	// localhost:포트번호/ch5/exam04/admin/admin1234
	@GetMapping("/ch5/exam04/{id}/{passwd}")   
	public String reqestMethod4(@PathVariable("id") String userId,
			@PathVariable("passwd") String userPw, Model model) {
		
		model.addAttribute("data1", "requestparam 예제");
		model.addAttribute("data2", "요청 id: " + userId + "<br>요청비번: " +userPw);
		return "viewPage07";
	}

//---------------------------------------
	// @MatrixVariable
	// id값 미 입력 _ 관리자라고 자동 입력: defaultValue
	//localhost:포트번호/ch5/exam05/admin;passwd=1234;passwd=5678
	@GetMapping("/ch5/exam05/{id}") 
	public String reqestMethod5(@PathVariable("id") String userId,
			@MatrixVariable("passwd") String userPw, Model model) {
		
		model.addAttribute("data1", "requestparam 예제");
		model.addAttribute("data2", "요청 id: " + userId + "<br>요청비번: " +userPw);
		return "viewPage07";
	}

//---------------------------------------
	// @MatrixVariable
	// id값 미 입력 _ 관리자라고 자동 입력: defaultValue
	//localhost:포트번호/ch5/exam06/admin;passwd=1234;/user/hong;passwd=5678
	@GetMapping("/ch5/exam06/{id1}/user/{id2}") 
	public String reqestMethod6(@PathVariable("id1") String userId1,
			@MatrixVariable(value="passwd", pathVar="id1")String userPw1,
			@PathVariable("id2") String userId2,
			@MatrixVariable(value="passwd", pathVar="id2") String userPw2,
			Model model) {
		
		model.addAttribute("data1", "requestparam 예제");
		model.addAttribute("data2", "요청 id: " + userId1 + ", " + userId2 + "<br>요청비번: " +userPw1 + ", " +  userPw2);
		return "viewPage07";
	}
}