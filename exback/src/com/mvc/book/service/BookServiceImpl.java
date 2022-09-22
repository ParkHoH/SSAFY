package com.mvc.book.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.book.dao.BookDAO;
import com.mvc.book.dao.BookDAOImpl;
import com.mvc.book.vo.Book;

public class BookServiceImpl implements BookService{
	BookDAO dao;
	
	public BookServiceImpl() {
		dao = new BookDAOImpl();
	}
	
	public ArrayList<Book> selectAll() {
		return dao.selectAll();
	}

	public Book selectOne(String isbn) {
		return dao.selectOne(isbn);
	}

	public void insert(HttpServletRequest request, HttpServletResponse response) {
		dao.insert(request, response);
	}

	public void delete(String isbn) {
		dao.delete(isbn);
	}

}
