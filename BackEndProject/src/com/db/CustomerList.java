package com.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CustomerList")
public class CustomerList extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static String DBMS = "mysql";
	static String url = "jdbc:" + DBMS + "://localhost:3306/scottdb";
	static String user = "scott";
	static String password = "scott";
	static String driver = "com." + DBMS + ".cj.jdbc.Driver";
	
	@Override
	public void init() throws ServletException {
		try {
			Class.forName(driver);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		Connection con;
		Statement  stat;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			stat = con.createStatement();
			ResultSet rs = stat.executeQuery("select num, name, address from customer");
			 
			out.println("<table border=1>");
			out.println("<th>번호</th>");
			out.println("<th>이름</th>");
			
			 while (rs.next()) {
				 out.println("<tr>");
				 String num = rs.getString(1);
				 String name = rs.getString(2);
				 
				 out.println("<td>" + num + "</td>");
				 out.println("<td><a href=CustomerDetail?num=" + num + ">" + name + "</a></td>");
				 out.println("</tr>");
			 }
			 out.println("</table>");
			 out.println("<a href=form/CustomerInsert.html>고객등록</a>");
			 
			 stat.close();
			 con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
