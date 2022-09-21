package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CheckoutServlet")
public class CheckoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		// 1. parameter 받기
		String id = request.getParameter("id");
		
		// 2. 세션 접근을 위해 세션 얻어오기
		HttpSession session = request.getSession();
		
		if (session == null) {
			out.println("<h3>장바구니가 비었습니다.</h3>");
			out.println("<a href=ShopServlet>쇼핑하러 가기</a>");
		} else {
			String msg = "";
			int[] tomato = (int[]) session.getAttribute("tomato");
			int[] orange = (int[]) session.getAttribute("orange");
			
			if (id.equals("see")) {
				out.println("<h3>장바구니 안의 토마토는 " + tomato[0] + "개, 오렌지는 " + orange[0] + "개 있습니다.");
			} else {
				session.invalidate();
				msg = "계산이 완료되었습니다. 쇼핑백은 비었습니다.";
			}
			
			out.println("<h1>쇼핑백</h1>");
			
		}
		
	}


}
