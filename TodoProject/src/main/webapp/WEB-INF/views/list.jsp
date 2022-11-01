<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container text-center">
		<img src="resources/image/f1.jpg" />
		<h1>Spring MVC 게시판</h1>

		<jsp:include page="loginCheck.jsp" />
		
		<form action="find" method="post">
			검 색 : <select name="search">
				<option value="id">사용자</option>
				<option value="content">내용</option>
			</select> <input type="text" name="word" /> <input type="submit" value="검색" />
		</form>


		<table class="table table-striped">
			<thead>
				<tr>
					<th>번호</th>
					<th>내용</th>
					<th>체크</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="item">
					<tr>
						<td>${item.num }</td>
						<td><a href="find?num=${item.num}">${item.content }</a></td>
						<td>${item.done }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
	</div>
	<br>
	<a href="create">새글쓰기</a>
</body>
</html>



