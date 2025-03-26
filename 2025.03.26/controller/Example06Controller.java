package com.rabbit.Chap04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Example06Controller {
	// Model 클래스에서 뷰에 전달
	@GetMapping("/exam06")
	public String requestMethod6(Model model) {
		model.addAttribute("data1", "Model 예제");
		model.addAttribute("data2", "<h3> 웹 요청 url은 /exam06입니다.</h3>");
		return "viewPage06";
	}
	
	@GetMapping("/exam07")
	public String requestMethod7(ModelMap model) {
		model.addAttribute("data3", "본인이름");
		model.addAttribute("data4", "<h2> 웹 요청 url은 /exam07입니다.</h2>");
		return "viewPage07";
	}
	
	@GetMapping("/exam08")
	public ModelAndView requestMethod8() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("data5", "학과");
		mav.addObject("data6", "학번");
		mav.setViewName("viewPage08");
		return mav;
	}
}