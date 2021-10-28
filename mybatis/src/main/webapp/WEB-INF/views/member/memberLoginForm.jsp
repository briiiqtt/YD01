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
		<div>
			<h1>로그인</h1>
		</div>
		<div>
			<form id="frm" name="frm" action="memberLogin.do" method="post">
				<table>
					<tr>
						<th>아이디</th>
						<td><input type="text" id="id" name="id"></td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td><input type="password" id="password" name="password"></td>
					</tr>
				</table>
				<div>
				<input type="submit" value="로그인">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="추ㅣ소">&nbsp;&nbsp;&nbsp;
				</div>
			</form>
		</div>
	</div>
</body>
</html>