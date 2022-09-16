package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @: 어노테이션-프로그램 실행 시 필요한 설정 정보 등을 대신함.
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	// doGet : 서비스 메서드. 클라이언트 요청에 대한 응답을 만들어내는 메서드
	// request : 클라이언트에서 서버로 들어오는 "요청"과 관련한 정보가 들어 있음
	// response : 서버에서 클라인언트로 나가는 "응답"과 관련한 정보가 들어 있음
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서버에서 클라이언트로 보내는 컨텐트 타입 지정
		response.setContentType("text/html; charset=utf-8"); // MIME 타입 
		
		// 서버에서 클라이언트로 보낼 내용을 위해 출력 스트림
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("	<h1>hello, Servlet!!!</h1>");
		out.println("	<a href=WelcomServlet>welcome page</a>");
		out.println("	<a href=LoginCheck?id=kim&pass=123>loginTest page</a>");
		out.println("</body></html>");
		
	}

}
