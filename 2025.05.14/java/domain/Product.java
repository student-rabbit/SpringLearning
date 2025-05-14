package com.rabbit.Chap11.domain;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Product {
	// 유효성 검사 제약 항목은 도메인 역할을 클래스에 작성
	@NotEmpty	// 공백인지 아닌지 검사
	@Size(min = 4, max = 10, message="글자 4개 이상에서 10개 이하로 작성")	// 최소 4~10자리 입력 가능
	private String name;
	
	@Min(value = 0)	// 값이 0이상인지 검사
	private int price;
}
