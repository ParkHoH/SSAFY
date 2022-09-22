package com.mvc.book.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.book.vo.Book;

public interface BookService {

	ArrayList<Book> selectAll();
	Book selectOne(String isbn);
	void insert(HttpServletRequest request, HttpServletResponse response);
	void delete(String isbn);

}
