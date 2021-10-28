<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../home/header.jsp"/>
	<div align="center">
	<div><h1>내 정보</h1></div>
		<div>
			<table border="1">
				<tr>
					<th>아이디</th>
					<td>${memberInfo.id }</td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td>${memberInfo.password }</td>
				</tr>
				<tr>
					<th>이름</th>
					<td>${memberInfo.name }</td>
				</tr>
				<tr>
					<th>주소</th>
					<td>${memberInfo.address }</td>
				</tr>
				<tr>
					<th>전화번호</th>
					<td>${memberInfo.tel }</td>
				</tr>
				<tr>
					<th>권한</th>
					<td>${memberInfo.author }</td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>