<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
	<%@ include file="/include/head.jsp" %>
</head>
<body>
	<%@ include file="/include/nav.jsp" %>	


	<div class="container text-center">
	<img src="image/f1.jpg"/>
	<h1>MVC 책</h1>	

	<table class="table table-striped">
		<thead>
			<tr>
				<th>ISBN</th>
				<th>제목</th>
				<th>가격</th>
				<th>설명</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ books }" var="book">
				<tr>
					<td>${ book.isbn }</td>
					<td><a href="/mvc/read.bod?isbn=${ book.isbn }">${ book.title }</a></td>
					<td>${ book.price }</td>
					<td>${ book.descript }</td>
					<td>${ book.regdate }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br>		
	</div>
</body>
</html>



