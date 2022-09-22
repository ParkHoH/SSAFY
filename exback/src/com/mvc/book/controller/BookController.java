package com.mvc.book.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.book.service.BookService;
import com.mvc.book.service.BookServiceImpl;
import com.mvc.book.vo.Book;

public class BookController {
	BookService service;
	
	public BookController() {
		service = new BookServiceImpl();
	}
	
	public void list(HttpServletRequest request, HttpServletResponse response) {
		ArrayList<Book> books = service.selectAll();
		request.setAttribute("books", books);
		
		String url = "/views/list.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		try {
			dispatcher.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void read(HttpServletRequest request, HttpServletResponse response) {
		Book b = service.selectOne(request.getParameter("isbn"));
		request.setAttribute("b", b);
		
		String url = "/views/read.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		try {
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertForm(HttpServletRequest request, HttpServletResponse response) {
		String url = "/views/insertForm.jsp";
		
		HttpSession session = request.getSession();
		if (session.getAttribute("user") == null) {
			url = "/views/loginForm.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		try {
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void insertProcess(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String isbn = request.getParameter("isbn");
		String title = request.getParameter("title");
		String price = request.getParameter("price");
		String descript = request.getParameter("descript");
		String regdate = request.getParameter("regdate");
		
		if (isbn == null || title == null || price == null || descript == null || regdate == null) {
			throw new Exception();
		}
		
		service.insert(request, response);
		request.setAttribute("msg", "글쓰기 성공!");
		
		String url = "/list.bod";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	public void delete(HttpServletRequest request, HttpServletResponse response) {
		service.delete(request.getParameter("isbn"));
		request.setAttribute("msg", "삭제 완료!");
		
		String url = "/list.bod";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		try {
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
