package com.rabbit.BookMarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rabbit.BookMarket.domain.Book;
import com.rabbit.BookMarket.service.BookService;

@Controller
public class BookController {
	// 컨트롤러와 서비스의 연결
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/books")
	public String requestBookList(Model model) {
		// 뷰에 전달할 값 준비
		List<Book> list = bookService.getAllBookList();
		model.addAttribute("bookList", list);
		return "books";		//books.html과 연결할 예정
		
	} // end of requestBookList
}  // end of BookController