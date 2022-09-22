<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<HTML>
<head>
	<%@ include file="/include/head.jsp" %>
</head>

<body>
	<%@ include file="/include/nav.jsp" %>	
	<div class="container text-center">
		<img src="image/f5.jpg" />
		<h1>책 등록</h1>
		<form action="insertProcess.bod" method="post">
			<div class="form-group text-left">
				<label for="title">ISBN:</label> 
				<input type="text"	class="form-control" name="isbn">
			</div>

			<div class="form-group text-left">
				<label for="pw">TITLE:</label> 
				<input type="text"	class="form-control" name="title">
			</div>
			<div class="form-group text-left">
				<label for="name">PRICE:</label> 
				<input type="text"	class="form-control" name="price">
			</div>
			<div class="form-group text-left">
				<label for="comment">내 용:</label>
				<textarea class="form-control" rows="5" id="content" name="descript"></textarea>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
		<a href="list.bod">전체화면</a>
	</div>

</BODY>
</HTML>











