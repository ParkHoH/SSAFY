package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		
		// 1. 클라이언트를 위해 세션을 생성
		// true: 기존 세션 체크 후에 있으면 생성, 있으면 리턴
		// false: 기존 세션 체크 후에 없으면 생성, 있으면 리턴
		HttpSession session = request.getSession(true); // 파라메터를 안 넣으면 기본이 true
		
		// 2. 세션이 처음 만들어진 거라면 데이터를 저장할 자료구조 준비
		if (session.isNew()) {
			session.setAttribute("tomato", new int[] {0}); // 토마토의 개수
			session.setAttribute("orange", new int[] {0}); // 오렌지의 개수
		}
		
		String msg = "";
		// 세션에 접근해서 작업하기
		int[] tomato = (int[]) session.getAttribute("tomato");
		int[] orange = (int[]) session.getAttribute("orange");
		
		if (id.equals("tomato")) { // 토마토를 살 경우
			tomato[0]++;
			msg = "토마토를 쇼핑백에 추가했습니다!";
		} else if (id.equals("orange")) {
			orange[0]++;
			msg = "오렌지를 쇼핑백에 추가했습니다!";
		}
		
		msg += "<br> 현재 토마토는 " + tomato[0] + "개, 오렌지는 " + orange[0] + "개 입니다.";
		
		out.println("<h1>쇼핑백 내용</h1>");
		out.println(msg + "<hr>");
	}

}
