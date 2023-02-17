<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>답변 쓰기</title>
</head>
<body>
	<h2>답변 쓰기</h2>
	<hr>
	<table border="1" cellpadding="0" cellspacing="0" width="600">
	<form action="reply" method="post">
			<input type="hidden" name="bid" value="${contentDto.bid }">
			<input type="hidden" name="bgroup" value="${contentDto.bgroup }">
			<input type="hidden" name="bstep" value="${contentDto.bstep }">
			<input type="hidden" name="bindent" value="${contentDto.bindent }">
		<tr>
			<th>글번호</th>
			<td>${contentDto.bid }</td>
		</tr>		
		<tr>
			<th>답변자</th>
			<td><input type="text" name="bname" size="60"></td>
		</tr>
		<tr>
			<th>제 목</th>
			<td><input type="text" name="btitle" value="[답변] ${contentDto.btitle }" size="60"></td>
		</tr>
		<tr>
			<th>원글내용</th>
			<td height="100"><textarea rows="10" cols="45">${contentDto.bcontent }</textarea></td>
		</tr>
		<tr>
			<th>답변내용</th>
			<td height="100"><textarea name="bcontent" rows="5" cols="45"></textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
			<input type="submit" value="답변완료">
			<input type="button" value="글목록" onclick="javascript:window.location='list'">
			</td>
		</tr>
	</form>
	</table>
</body>
</html>