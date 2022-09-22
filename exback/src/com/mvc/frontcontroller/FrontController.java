package com.mvc.frontcontroller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.book.controller.BookController;
import com.mvc.user.controller.UserController;

@WebServlet("*.bod")
public class FrontController extends HttpServlet {
    BookController con;
    UserController ucon;
    
    public FrontController() {
    	con = new BookController();
    	ucon = new UserController();
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("UTF-8");
			String reqPath = request.getServletPath();
			
			if (reqPath.equals("/list.bod")) {
				con.list(request, response);
				
			} else if (reqPath.equals("/read.bod")) {
				con.read(request, response);
				
			} else if (reqPath.equals("/insertForm.bod")) {
				con.insertForm(request, response);
				
			} else if (reqPath.equals("/insertProcess.bod")) {
				con.insertProcess(request, response);
				
			} else if (reqPath.equals("/delete.bod")) {
				con.delete(request, response);
				
			} else if (reqPath.equals("/loginForm.bod")) {
				ucon.loginForm(request, response);
				
			} else if (reqPath.equals("/loginProcess.bod")) {
				ucon.loginProcess(request, response);
				
			} else if (reqPath.equals("/logout.bod")) {
				ucon.logout(request, response);
			} 
			
		} catch (Exception e) {
			String url = "/error/error.jsp";
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			try {
				dispatcher.forward(request, response);
				
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

}
