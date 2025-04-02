package com.rabbit.BookMarket.domain;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
	// 프로젝트에 사용할 데이터 정보
	// 멤버변수 + 생성자 + getter/setter 로 구성
	
	private String bookId;			// 컬럼의 이름 - 도셔id
	private String name; 			// 책 이름
	private BigDecimal unitPrice;	// 가격
	private String author;			//저자
	private String description;		// 책설명
	private String publisher;		// 출판사
	private String category;		// 뷴류
	private long unitsInStock;		// 재고 수
	private String releaseDate;		// 출판일
	private String condition;		// 신규, 중고, 전자책
	
//	// 생성자 -> 기본 생성자 _전부 다 만들면 안된다.
//	public Book() {
//		super();
//	}
//	
//	// getter/setter
//	public String getBookId() {
//		return bookId;
//	}
//
//	public void setBookId(String bookId) {
//		this.bookId = bookId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public BigDecimal getUnitPrice() {
//		return unitPrice;
//	}
//
//	public void setUnitPrice(BigDecimal unitPrice) {
//		this.unitPrice = unitPrice;
//	}
//
//	public String getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public String getPublisher() {
//		return publisher;
//	}
//
//	public void setPublisher(String publisher) {
//		this.publisher = publisher;
//	}
//
//	public String getCategory() {
//		return category;
//	}
//
//	public void setCategory(String category) {
//		this.category = category;
//	}
//
//	public long getUnitsInStock() {
//		return unitsInStock;
//	}
//
//	public void setUnitsInStock(long unitsInStock) {
//		this.unitsInStock = unitsInStock;
//	}
//
//	public String getReleateDate() {
//		return releateDate;
//	}
//
//	public void setReleateDate(String releateDate) {
//		this.releateDate = releateDate;
//	}
//
//	public String getCondition() {
//		return condition;
//	}
//
//	public void setCondition(String condition) {
//		this.condition = condition;
//	}
//	
} // end of Book