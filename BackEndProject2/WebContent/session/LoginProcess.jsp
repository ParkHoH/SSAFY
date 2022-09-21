<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>세션에 값 저장</h1>
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	
	session.setAttribute("id", id);
	session.setAttribute("pass", pass);
	
	ArrayList<String> list = new ArrayList<>();
	list.add("blue");
	list.add("yello");
	list.add("green");
	
	session.setAttribute("list", list);
%>

<a href="check.jsp">check 하러가기</a>
<%= id %>
<%= pass %>

</body>
</html>