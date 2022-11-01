<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<HTML>
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
<BODY>
	<div class="container text-center">
		<img src="resources/image/f5.jpg" />
		<h1>수정하기</h1>
		<form action="update" method="POST">

			<input type="hidden" name="num" value="${todo.num }">
			<div class="form-group text-left">
				<label for="content">내 용 :</label> <input type="text"
					class="form-control" name="content" value="${todo.content }">
			</div>

			<div class="form-group text-left">
				<label for="id">아이디 :</label> <input type="text"
					class="form-control" name="id" value="${todo.id }">
			</div>
			<div class="form-group text-left">
				<label for="sdate">시작일:</label> <input type="date"
					class="form-control" name="sdate" value="${todo.sdate }">
			</div>
			<div class="form-group text-left">
				<label for="edate">종료일:</label> <input type="date"
					class="form-control" name="edate" value="${todo.edate }">
			</div>
			<div class="form-group text-left">
				<label for="done">상태:</label>
				<select class="form-control" name="done">
					<c:if test="${todo.done eq 'Y'}">
						<option selected>Y</option>
						<option>N</option>
					</c:if>
					
					<c:if test="${todo.done eq 'N'}">
						<option>Y</option>
						<option selected>N</option>
					</c:if>
				</select>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
		<a href="">전체화면</a>
	</div>

</BODY>
</HTML>











