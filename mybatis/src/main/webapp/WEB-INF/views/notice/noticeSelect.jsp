<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 세부보기</title>
<script>
	function CallEdit(str) {
		document.frm.modContents.value = document.frm.contents.value;
		document.frm.modTitle.value = document.frm.title.value;
		if (str == 'E') {
			frm.action = "noticeEdit.do";
		} else {
			frm.action = "noticeDelete.do";
		}
		frm.submit();
	}
</script>
</head>
<body>
	<jsp:include page="../home/header.jsp" />
	<div align="center">
		<div>
			<h1>공지사항 조회;</h1>
		</div>
		<div>
			<form id="frm" name="frm" action="" method="post">
				<table border="1">
					<tr>
						<th width="70">글번호</th>
						<td width="70" align="center">${notice.nId }</td>
						<th width="100">작성자</th>
						<td width="100" align="center">${notice.id }</td>
						<th width="100">작성일</th>
						<td width="100" align="center">${notice.writeDate }</td>
						<th width="70">조회수</th>
						<td width="70" align="center">${notice.hit }</td>
					</tr>
					<tr>
						<th>제목</th>
						<td colspan="7"><textarea cols="92" name="title">${notice.title }</textarea></td>
					</tr>
					<tr>
						<th>내용</th>
						<td colspan="7"><textarea rows="10" cols="92" name="contents">${notice.contents }</textarea>
						</td>
					</tr>
				</table>
				<input type="hidden" id="nId" name="nId" value="${notice.nId }">
				<input type="hidden" id="modContents" name="modContents" value="">
				<input type="hidden" id="modTitle" name="modTitle" value="">
			</form>
		</div>
		<br>
		<div>
			<button type="button" onclick="location.href='noticeList.do'">목록</button>
			&nbsp;&nbsp;&nbsp;
			<button type="button" onclick="CallEdit('E')">수정</button>
			&nbsp;&nbsp;&nbsp;
			<button type="button" onclick="CallEdit('D')">삭제</button>
		</div>
	</div>
</body>
</html>
