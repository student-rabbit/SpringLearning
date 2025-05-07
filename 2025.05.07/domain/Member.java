package com.rabbit.Chap10.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
	private String name;
	private MultipartFile fileImage;
	
}
