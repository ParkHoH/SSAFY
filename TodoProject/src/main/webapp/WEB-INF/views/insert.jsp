<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

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
		<h1>새글쓰기</h1>
		<form action="create" method="POST">
			<div class="form-group text-left">
				<label for="content">내 용 :</label> <input type="text"
					class="form-control" name="content">
			</div>

			<div class="form-group text-left">
				<label for="id">아이디 :</label> <input type="text"
					class="form-control" name="id">
			</div>
			<div class="form-group text-left">
				<label for="sdate">시작일:</label> <input type="date"
					class="form-control" name="sdate">
			</div>
			<div class="form-group text-left">
				<label for="edate">종료일:</label> <input type="date"
					class="form-control" name="edate">
			</div>
			<div class="form-group text-left">
				<label for="done">상태:</label>
				<select class="form-control" name="done">
					<option>Y</option>
					<option>N</option>
				</select>
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
		<a href="">전체화면</a>
	</div>

</BODY>
</HTML>











