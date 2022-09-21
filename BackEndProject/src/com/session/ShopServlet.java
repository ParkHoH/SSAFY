package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ShopServlet")
public class ShopServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h1>Data's Mall</h1>");
		out.println("<a href=CartServlet?id=tomato>쇼핑백에 토마토 넣기</a> &nbsp;");
		out.println("<a href=CartServlet?id=orange>쇼핑백에 오렌지 넣기</a> &nbsp;");
		out.println("<a href=CheckoutServlet?id=see>쇼핑백 보기</a> &nbsp;");
		out.println("<a href=CheckoutServlet?id=checkout>계산하기</a> &nbsp;");
		out.println("</body></html>");
	}


}
