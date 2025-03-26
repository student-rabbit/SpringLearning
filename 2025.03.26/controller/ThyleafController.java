package com.rabbit.Chap04.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rabbit.Chap04.vo.DataDto;

@Controller
public class ThyleafController {
	
	@GetMapping("/t_output")
	public String thymeleafOutput(Model model) {
		Map<String, String> rmap = new HashMap<>();
		rmap.put("data1", "본인이름");
		rmap.put("data2", "20");
		model.addAttribute("mapdata", rmap);
		return "t_output";
	}

	@GetMapping("/t_output1")
	public String thymeleafOutput1(Model model) {
		DataDto dData = new DataDto();
		dData.setName("홍길동");
		dData.setAge(20);
		dData.setAddress("대한민국 서울시");
		model.addAttribute("dtoData", dData);
		return "t_output1";
	}
}
