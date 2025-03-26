package com.rabbit.Chap02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hi")
	public String Hi() {
		return "Hi";
	}
}