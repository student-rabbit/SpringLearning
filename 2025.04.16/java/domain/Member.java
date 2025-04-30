package com.rabbit.Chap07.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor		// 롬복을 사용해서 코드 길이가 줄어든다. 변수 이름을 변경할 때 자동으로 바뀐다.
public class Member {
	// 멤버변수 => 폼 태그의 name => 테이블 컬럼이름을 동일하게
	
	private String id;
	private int passwd;
	private String city;
	private String sex;
	private String[] hobby;
	private String greetings;
	
}