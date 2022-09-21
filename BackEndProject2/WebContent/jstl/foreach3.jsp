<%@page import="java.util.ArrayList, com.basic.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("100", "kim", "seoul"));
		list.add(new Customer("200", "lee", "la"));
		list.add(new Customer("300", "park", "london"));
		
		request.setAttribute("list", list);
	%>
	
	<h1>Customer List</h1>
	<table border="1">
		<c:forEach items="${requestScope.list}" var="customer">
			<tr>
				<td>${customer.num}</td>
				<td>${customer.name}</td>
				<td>${customer.address}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>