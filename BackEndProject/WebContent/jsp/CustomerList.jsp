<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>

<%!
	static String DBMS = "mysql";
	static String url = "jdbc:" + DBMS + "://localhost:3306/scottdb";
	static String user = "scott";
	static String password = "scott";
	static String driver = "com." + DBMS + ".cj.jdbc.Driver";
	
	public void jspInit() {
		try {
			Class.forName(driver);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
%>

<% 
	Connection con = DriverManager.getConnection(url, user, password);
	Statement stat = con.createStatement();
	ResultSet rs = stat.executeQuery("select num, name, address from customer");
%>
	<h1>Customer Data</h1>
	<table border=1>
	<th></th>
	<th></th>

<% 
	 while (rs.next()) {
		 String num = rs.getString(1);
		 String name = rs.getString(2);
%>
		 
		 <tr>
		 	<td><%= num %></td>
		 	<td><a href=CustomerDetail.jsp?num=<%= num %>><%= name %></a></td>
		</tr>
<%
	 }
%>
	 </table>
	 <a href=form/CustomerInsert.html></a>

<% 
	 stat.close();
	 con.close();
%>
