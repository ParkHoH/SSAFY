<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
		<h1>todo 수정</h1>
		<form action="modify" method="post">
			<div class="form-group text-left">
				<label for="num">NUM:</label> 
				<input readonly type="text" class="form-control" name="num" value="${ todo.num }"  required>
			</div>
		
			<div class="form-group text-left">
				<label for="id">ID:</label> 
				<input type="text" class="form-control" name="id" value="${ todo.id }" required>
			</div>

			<div class="form-group text-left">
				<label for="sdate">시작일:</label>
				<input type="date" class="form-control" name="sdate" value="${ todo.sdate }" required>
			</div>
			
			<div class="form-group text-left">
				<label for="edate">종료일:</label> 
				<input type="date" class="form-control" name="edate" value="${ todo.edate }" required>
			</div>
			
			<div class="form-group text-left">
				<label for="done">실행 여부:</label> 
				<select class="form-control" name="done">
					<c:if test="${ todo.done eq 'Y'}">
			        	<option selected>Y</option>
			        	<option>N</option>
					</c:if>
					<c:if test="${ todo.done eq 'N'}">
			        	<option>Y</option>
			        	<option selected>N</option>
					</c:if>
		      	</select>
			</div>
			
			<div class="form-group text-left">
				<label for="content">내 용:</label>
				<textarea class="form-control" rows="5" id="comment" name="content" required>${ todo.content }</textarea>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
		<a href="list">전체 목록</a>
	</div>

</BODY>
</HTML>











