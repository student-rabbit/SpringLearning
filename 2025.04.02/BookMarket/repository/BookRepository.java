package com.rabbit.BookMarket.repository;

import java.util.List;

import com.rabbit.BookMarket.domain.Book;

public interface BookRepository {
	// 메소드 정의 -- CRUD(생성 읽기 업데이트 딜리트) 기능
	List<Book> getAllBookList();	// 전체 조회 역할
	
} // end of BookRepository