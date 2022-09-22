package com.mvc.book.dao;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.book.vo.Book;

public interface BookDAO {

	ArrayList<Book> selectAll();
	Book selectOne(String isbn);
	void insert(HttpServletRequest request, HttpServletResponse response);
	void delete(String isbn);

}
