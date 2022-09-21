//package com.cookie;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/CookieTest")
//public class CookieTest extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	@Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		
//		// 1. ��û �����κ��� ��Ű�� �˾Ƴ�
//		Cookie[] cookies = request.getCookies();
//		if (cookies == null || cookies.length == 0) { // ��Ű�� ���� ���
//			out.println("<h1>No Cookie</h1>");
//			
//		} else { // ��Ű ����
//			out.println("<h1>Cookie Test</h1>");
//			for (int i = 0; i < cookies.length; i++) {
//				Cookie c = cookies[i];
//				String name = c.getName();
//				String value = c.getValue();
//				
//				out.println(name + " : " + value);
//			}
//			out.println("<hr>");
//			out.println("<hr><a href=CookieTest>�ٽ� �湮�ϱ�</a>");
//		}
//		
//	}
//	
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		
//		// 1. Ŭ���̾�Ʈ�� ���� ���� �޾� ��Ű�� ����
//		String id = request.getParameter("id");
//		String pass = request.getParameter("pass");
//		
//		// 1-1. ��Ű ����
//		Cookie idCookie = new Cookie("id", id);
//		Cookie passCookie = new Cookie("pass", pass);
//		
//		// 1-2. ������ ��Ű�� �Ӽ� ����
//		int idExpiry = 60 * 60 * 24 * 365; // �ʴ��� ���� (1��)
//		int passExpiry = -1; // �������� ���� ��Ű �����
//		
//		idCookie.setMaxAge(idExpiry); // ��Ű�� ��ȿ �Ⱓ ����
//		passCookie.setMaxAge(passExpiry);
//		
//		// 1-3. ������ ��Ű�� ���䰴ü�� ����
//		response.addCookie(idCookie);
//		response.addCookie(passCookie);
//		
//		// 2. Ȯ�� �޼��� ���
//		out.println("<html><body>");
//		out.println("<h1>��Ű�� ����Ǿ����ϴ�</h1>");
//		out.println("<hr><a href=CookieTest>�ٽ� �湮�ϱ�</a>");
//		out.println("</body></html>");
//	}
//
//}
