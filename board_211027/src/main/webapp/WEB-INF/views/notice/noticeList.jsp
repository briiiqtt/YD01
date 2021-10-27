<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
<script>
	function CallNotice(n){
		frm.nid.value = n;
		frm.action = "noticeSelect.do";
		frm.submit();
	}
</script>
</head>
<body>
<jsp:include page="../home/header.jsp"/>
	<div align="center">
		<div>
			<h1>공지사항 목록</h1>
		</div>
		<table border="1">
			<thead>
				<tr>
					<th width="100">글번호</th>
					<th width="150">작성자</th>
					<th width="250">제목</th>
					<th width="150">작성일</th>
					<th width="100">조회수</th>
				</tr>
			</thead>
			<c:forEach items="${notices }" var="notice">
				<tbody>
					<tr onmouseover="this.style.background='gray'"
						onmouseleave="this.style.background='white'"
						style="cursor: pointer;" onclick="CallNotice(${notice.nId})">
						<td align="center">${notice.nId }</td>
						<td align="center">${notice.name }</td>
						<td align="center">${notice.title }</td>
						<td align="center">${notice.writeDate }</td>
						<td align="center">${notice.hit }</td>
					</tr>
				</tbody>
			</c:forEach>
		</table>
		<br>
		<div>
			<button type="button" onclick="location.href='noticeForm.do'">글쓰기</button>
			&nbsp;&nbsp;&nbsp;
			<button type="button" onclick="location.href='home.do'">홈ㅁㅁ</button>
			&nbsp;&nbsp;&nbsp;
		</div>
		<div>
			<form id="frm" action="" method="post">
				<input type="hidden" id="nid" name="nid">
			</form>
		</div>
	</div>
</body>
</html>