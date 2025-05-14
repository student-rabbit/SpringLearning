package com.rabbit.Chap11.domain;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Member1 {
	@MemberId
	private String memberId;
	
	@Size(min=4, max=10, message = "4-10자로 입력하시오")
	private String passwd;
	
}
