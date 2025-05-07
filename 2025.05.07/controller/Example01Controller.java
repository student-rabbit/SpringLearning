package com.rabbit.Chap10.controller;

import java.io.File;
import java.lang.reflect.Member;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/exam01")
public class Example01Controller {
	// 입력화면
	@GetMapping("/form")	// localhost:포트번호/exam01/form
	public String requestForm() {
		return "viewPage01";
	}
	
	// 출력화면
	@PostMapping("/form1")	// 전송하기 버튼 클릭 시 입력 정보가 전달 /아래와 겹치지 않기 위해 url 수정
	public String submitForm(MultipartHttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		MultipartFile file = request.getFile("fileImage");
		
		String filename = file.getOriginalFilename();
		File saveFile = new File("c:\\upload_b\\" + name + "_" + filename);
		
		try {
			file.transferTo(saveFile);
			model.addAttribute("data1", "Multi를 이용한 예");
			model.addAttribute("data2", filename);
			model.addAttribute("data3", saveFile.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "viewPage_process";
	}
	
	//@Requestparam
	@PostMapping("/form2") //아래와 겹치지 않기 위해 url 수정
	public String submitForm1(@RequestParam("name") String name, @RequestParam("fileImage") MultipartFile file, Model model) {

		String filename = file.getOriginalFilename();
		File saveFile = new File("c:\\upload_b\\" + name + "_" + filename);
		
		try {
			file.transferTo(saveFile);
			model.addAttribute("data1", "Multi를 이용한 예");
			model.addAttribute("data2", filename);
			model.addAttribute("data3", saveFile.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "viewPage_process";
	}
	
	// 유형3: @ModelAttribute 이용
	@PostMapping("/form")
	public String submtiFrom2(@ModelAttribute Member member, Model model) {
		String name = member.getName();
		MultipartFile file = member.getFileImage();
		
		String filename = file.getOriginalFilename();
		File saveFile = new File("c:\\upload_b\\" + name + "_" + filename);
		
		try {
			file.transferTo(saveFile);
			model.addAttribute("data1", "Multi를 이용한 예");
			model.addAttribute("data2", filename);
			model.addAttribute("data3", saveFile.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "viewPage_process";
	}
}
