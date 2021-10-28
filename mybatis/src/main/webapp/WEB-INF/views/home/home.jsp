<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="../home/header.jsp"/>
<div align="center">
<h1>여기가 홈페이지</h1>
<a href="memberList.do">멤버목록</a><br>
<c:if test="${not empty id }">
	<a href="memberSelect.do">한명조회</a><br>
</c:if>
<a href="noticeList.do">게시글 목록</a><br>
<a href="memberLoginForm.do">로그인</a><br>
</div>
</body>
</html>