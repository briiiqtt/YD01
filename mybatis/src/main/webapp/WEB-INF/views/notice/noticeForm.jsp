<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항작성</title>
</head>
<body>
<jsp:include page="../home/header.jsp"/>
	<div align="center">
		<div>
			<h1>게시글 작성</h1>
		</div>
		<div>
			<form id="frm" action="noticeInsert.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="100">아이디</th>
							<td width="150"><input type="text" id="id" name="id"></td>
							<th width="100">작성자</th>
							<td width="150"><input type="text" id="name" name="name"></td>
							<th width="100">작성일</th>
							<td width="150"><input type="date" id="writeDate"
								name="writeDate"></td>
						</tr>
						<tr>
							<th>제목</th>
							<td colspan="5"><input type="text" id="title" name="title" style="width:99%;"></td>
						</tr>
						<tr>
							<th>내용</th>
							<td colspan="5"><textarea id="contents" name="contents"
									rows="10" style="width:99%;"></textarea></td>
						</tr>
					</table>
				</div><br>
				<div>
				<input type="submit" value="저장">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취소">&nbsp;&nbsp;&nbsp;
				<input type="button" value="목록" onclick="location.href='noticeList.do'">;
				</div>
			</form>
		</div>
	</div>
</body>
</html>