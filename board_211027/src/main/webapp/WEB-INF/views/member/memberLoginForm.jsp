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
				<div>
					<table border="1">
						<tr>
							<th width="150">아이디</th>
							<td width="200">
							<input type="text" id="id" name="id" required="required" placeholder="아이디">
							</td>
						</tr>
						<tr>
							<th width="150">비밀번호</th>
							<td width="200">
							<input type="password" id="password" name="password" required="required" placeholder="비밀번호">
							</td>
						</tr>
					</table>
				</div><br>
				<div>
				<input type="submit" value="로그인"> &nbsp;&nbsp;&nbsp;
				<input type="reset" value="취소"> &nbsp;&nbsp;&nbsp;
				<input type="button" value="홈" onclick="location.href='home.do'">
				</div>
			</form>
		</div>
	</div>
</body>
</html>