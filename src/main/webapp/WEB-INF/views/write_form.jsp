<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
</head>
<body>
	<h2>게시판 글쓰기</h2>
	<hr>
	<table border="1" cellpadding="0" cellspacing="0" width="600">
	<form action="write" method="post">
		<tr>
			<th>이 름</th>
			<td><input type="text" name="bname"></td>
		</tr>
		<tr>
			<th>제 목</th>
			<td><input type="text" name="btitle" width="200"></td>
		</tr>
		<tr>
			<th>내 용</th>
			<td><textarea cols="45" rows="10" name="bcontent"></textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
			<input type="submit" value="글입력">
			<input type="button" value="글목록" onclick="javascript:window.location='list'">
			</td>
		</tr>
	</form>
	</table>	
</body>
</html>