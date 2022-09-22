package com.ssafy.sample.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.mvc")
public class EmpFrontController extends HttpServlet {
	EmpController con;
	
	public EmpFrontController() {
		con = new EmpController();
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) {
		try {
			// 1. 클라이언트로부터 들어오는 한글처리
			request.setCharacterEncoding("utf-8");
			
			//
			String reqString = request.getServletPath();
			
			if (reqString.equals("/list.mvc")) {
				con.list(request, response);
				
			} else if (reqString.equals("/read.mvc")) {
				con.read(request, response);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

}
