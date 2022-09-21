//package com.basic;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/Survey")
//public class Survey extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String dept = request.getParameter("dept");
//		String employee = request.getParameter("employee");
//		String comment = request.getParameter("comment");
//		String[] IDEs = request.getParameterValues("ide");
//		
//		PrintWriter out = response.getWriter();
//		
//		out.println("<h1>Welcome " + dept + "</h1>");
//		out.println("<h1>Employees : " + employee + "</h1>");
//		out.println("<h1>Comment : " + comment + "</h1>");
//		out.println();
//		
//		int idx = 1;
//		for (String IDE : IDEs) {
//			out.println("<h1>IDE " + idx++ + ": " + IDE + "</h1>");
//		}
//	}
//
//}
