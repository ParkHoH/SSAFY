package com.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CustomerDetail")
public class CustomerDetail extends HttpServlet {
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
		PreparedStatement  pstat;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			String sql = "select num, name, address from customer where num = ?";
			String num = request.getParameter("num");
			
			pstat = con.prepareStatement(sql);
			pstat.setString(1, num);
			
			ResultSet rs = pstat.executeQuery();
			
			rs.next();
			
			num = rs.getString(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			
			out.println("<table border=1>");
			
			out.println("<tr>");
			out.println("<td>번호</td>");
			 out.println("<td>" + num + "</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>이름</td>");
			 out.println("<td>" + name + "</td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>주소</td>");
			 out.println("<td>" + address + "</td>");
			out.println("</tr>");
			
			out.println("</table>");
			
			out.println("<a href=CustomerList>back</a>");
			
			pstat.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
