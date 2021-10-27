<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	function CallValidation(){
		var pw = frm.password.value;
		var pw1 = frm.password1.value;
		if(frm.name.value==""){
			alert('이름');
			frm.name.focus();
			return;
		}
		if(pw==pw1){
			frm.submit();
		} else{
			alert("비밀번호ㅗㅗㅗㅗㅗ");
			frm.password.value='';
			frm.password1.value='';
			frm.password.focus();
			return false;
		}
	}
</script>
<body>
	<jsp:include page="../home/header.jsp" />
	<div align="center">
		<div>
			<h1>회원가입</h1>
		</div>
		<div>
			<form id="frm" action="memberJoin.do" method="post">
				<div>
					<table border="1">
					<tr>
					<th width="100">아이디</th>
					<td width="200"><input type="text" id="id" name="id" required="required"></td>
					</tr>
					<tr>
					<th width="100">비밀번호</th>
					<td width="200"><input type="password" id="password" name="password" required="required"></td>
					</tr>
					<tr>
					<th width="100">비밀번호확인</th>
					<td width="200"><input type="password" id="password1" name="password1" required="required"></td>
					</tr>
					<tr>
					<th width="100">이름</th>
					<td width="200"><input type="text" id="name" name="name" required="required"></td>
					</tr>
					<tr>
					<th width="100">주소</th>
					<td width="200"><input type="text" id="address" name="address"></td>
					</tr>
					<tr>
					<th width="100">전화번호</th>
					<td width="200"><input type="text" id="tel" name="tel"></td>
					</tr>
					</table>
				</div><br>
				<input type="hidden" id="author" name="author" value="user">
				<input type="button" value="회원가입" onclick="CallValidation()">&nbsp;&nbsp;&nbsp;
				<input type="reset" value="취소">
			</form>
		</div>
	</div>
</body>
</html>