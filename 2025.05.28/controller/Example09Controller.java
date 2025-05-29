package com.rabbit.Chap13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rabbit.Chap13.domain.Person;

@Controller
@RequestMapping("/week13/exam09")
public class Example09Controller {
	
	@GetMapping
	public String showForm(@ModelAttribute Person person) {
		return "viewPage09";
	}
	
	@PutMapping
	public String submit(@ModelAttribute Person person, Model model) {
		model.addAttribute("data1", "@PutMapping");
		model.addAttribute("data2", person);
		return "viewPage09_result";
	}
}
