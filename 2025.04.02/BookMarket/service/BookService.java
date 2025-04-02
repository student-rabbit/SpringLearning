package com.rabbit.BookMarket.service;

import java.util.List;

import com.rabbit.BookMarket.domain.Book;

public interface BookService {
	// 메서드 정의 -> 포괄적인 서비스 역할
	// Repository랑 연결하는 메서드라면 메서드 이름을 동일하게
	List<Book> getAllBookList();
	
} // end of BookService