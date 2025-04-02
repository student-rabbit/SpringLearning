package com.rabbit.BookMarket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabbit.BookMarket.domain.Book;
import com.rabbit.BookMarket.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	// 서비스 -> 리포지토리에 연결
	@Autowired	// 주입 <=> setter method에 주입과 동일한 의미
	private BookRepository bookRepository;
	
	@Override
	public List<Book> getAllBookList() {
		return bookRepository.getAllBookList();
	}

} // end of BookService