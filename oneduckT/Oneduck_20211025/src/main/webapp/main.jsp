<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<jsp:include page="header.jsp" />
	<h1>여기는 메인 JSP인거시어요</h1>
	<form action="result.jsp" method="post" id="frm" name="frm">
		사용자 아이디: <input type="text" id="id" name="id"><br>
		사용자 패스워드: <input type="password" id="pw" name="pw"><br>
		<input type="submit" value="로그인">
	</form>
	<%@ include file="footer.jsp"%>
</body>
</html>