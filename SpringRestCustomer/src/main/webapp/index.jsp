<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>RESTful 웹서비스 클라이언트(JSON)</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript">	
</script>
</head>
<body onload="selectAll()">
	<div class="container">
		<form id="form1" class="form-horizontal">
			<h2>Customer Management</h2>
			<div class="form-group">
				<label>번호:</label> <input type="text" class="form-control" id="num">
			</div>
			<div class="form-group">
				<label>이름:</label> <input type="text" class="form-control" id="name">
			</div>

			<div class="form-group">
				<label>주소:</label> <input type="text" class="form-control"
					id="address">
			</div>

			<div class="btn-group">
				<input type="button" class="btn btn-primary" value="등록"	id="btnInsert" onclick="customerInsert()" /> 
					<input type="button"class="btn btn-primary" value="수정" id="btnUpdate"	onclick="customerUpdate()" /> 
					<input type="button"class="btn btn-primary" value="삭제" id="btnDelete" onclick="customerDelete()" /> 
					<input type="button"class="btn btn-primary" value="검색" id="btnUpdate"	onclick="customerSearch()" /> 
					<input type="button"class="btn btn-primary" value="전체" id="btnDelete" onclick="customerAll()" /> 
					<input type="button" class="btn btn-primary" value="초기화" id="btnInit" onclick="init()" />
			</div>
		</form>
	</div>
	<hr />
	<div class="container">
		<h2>사용자 목록</h2>
		<table class="table text-center">
			<thead>
				<tr>
					<th class="text-center">번호</th>
					<th class="text-center">이름</th>
					<th class="text-center">주소</th>
				</tr>
			</thead>
			<tbody id="tb"></tbody>
		</table>
	</div>
</body>
<script>
	function selectAll() {
		fetch("http://localhost:8080/rest/customers")
		.then(response => response.json())
		.then(data => selectAllResult(data));
	}
	
	function selectAllResult(data) {
		let list = ``;
		
		data.forEach((item) => {
			list += `<tr onclick='selectOne(\${item.num})'>
						<td>\${item.num}</td>
						<td>\${item.name}</td>
						<td>\${item.address}</td>
					</tr>`;
		});
		
		document.getElementById("tb").innerHTML = list;
	}

	function selectOne(num) {
		fetch("http://localhost:8080/rest/customers/" + num)
			.then(response => response.json())
			.then(data => selectOneResult(data));
	}

	function selectOneResult(data) {
		let num = document.getElementById("num");
		let name = document.getElementById("name");
		let address = document.getElementById("address");

		if (data != "") {
			num.value = data.num;
			name.value = data.name;
			address.value = data.address;
			
			num.readOnly = true;
			name.readOnly = true;
		} else {
			num.value = data;
			name.value = data;
			address.value = data;
		}
	}
	
	function init() {
		selectOneResult("");
		
		document.getElementById("num").readOnly = false;
		document.getElementById("name").readOnly = false;
	}

	function customerInsert() {
		let num = document.getElementById("num").value;
		let name = document.getElementById("name").value;
		let address = document.getElementById("address").value;

		if (num != "" && name != "" && address != "") {
			fetch("http://localhost:8080/rest/customers", {
				method: "POST",
				headers: {
					"Content-Type": "application/json",
				},
				body: JSON.stringify({
					"num": num,
					"name": name,
					"address": address
				})
			})
				.then(response => {
					selectAll();
					init();
				});

		} else {
			alert("모든 값을 입력해주세요.");
		}
	}

	function customerUpdate() {
		let num = document.getElementById("num").value;
		let name = document.getElementById("name").value;
		let address = document.getElementById("address").value;

		if (num != "") {
			fetch("http://localhost:8080/rest/customers", {
				method: "PUT",
				headers: {
					"Content-Type": "application/json",
				},
				body: JSON.stringify({
					"num": num,
					"name": name,
					"address": address
				})
			})
				.then(response => {
					selectAll();
					init();
				});

		} else {
			alert("모두 입력해주세요.");
		}
	}

	function customerDelete() {
		let num = document.getElementById("num").value;

		if (num != "") {
			fetch("http://localhost:8080/rest/customers/" + num, {
				method: "DELETE",
			})
				.then(response => {
					selectAll();
					init();
				});

		} else {
			alert("삭제할 번호를 입력해주세요.");
		}
	}

	function customerSearch() {
		let address = document.getElementById("address").value;

		console.log("hreerer");

		fetch("http://localhost:8080/rest/customers/find/" + address)
			.then(response => response.json())
			.then(data => selectAllResult(data));
	}

	function customerAll() {
		selectAll();
		init();
	}

</script>

</html>





