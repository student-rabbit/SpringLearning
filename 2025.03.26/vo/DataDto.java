package com.rabbit.Chap04.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataDto {
	private String name;
	private int age;
	private String address;
	
	// 아래와 같이 getter/setter 직접 만들거나 @Getter 혹은 @Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}