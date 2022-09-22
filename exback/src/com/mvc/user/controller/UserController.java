package com.mvc.user.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.user.service.UserService;
import com.mvc.user.service.UserServiceImpl;
import com.mvc.user.vo.User;

public class UserController {
	UserService service;
	
	public UserController() {
		service = new UserServiceImpl();
	}

	public void loginForm(HttpServletRequest request, HttpServletResponse response) {
		String url = "/views/loginForm.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		try {
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void loginProcess(HttpServletRequest request, HttpServletResponse response) {
		User user = new User(request.getParameter("id"), request.getParameter("pass"));
		boolean flag = service.login(user);
		
		String url = "/mvc/loginForm.bod";
		
		if (flag) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			url = "/mvc/index.jsp";
		} 
		
		try {
			response.sendRedirect(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void logout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.invalidate();
		String url = "/mvc/index.jsp";
		
		try {
			response.sendRedirect(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
