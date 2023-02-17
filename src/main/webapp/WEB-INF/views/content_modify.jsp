<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 내용수정</title>
</head>
<body>
	<h2>게시글 내용수정</h2>
	<hr>
	<table border="1" cellpadding="0" cellspacing="0" width="600">
	<form action="modify" method="post">
			<input type="hidden" name="bid" value="${contentDto.bid }">
		<tr>
			<th>글번호</th>
			<td>${contentDto.bid }</td>
		</tr>
		<tr>
			<th>조회수</th>
			<td>${contentDto.bhit }</td>
		</tr>
		<tr>
			<th>등록일</th>
			<td>${contentDto.bdate }</td>
		</tr>
		<tr>
			<th>이 름</th>
			<td>${contentDto.bname }</td>
		</tr>
		<tr>
			<th>제 목</th>
			<td><input type="text" name="btitle" value="${contentDto.btitle }" size="60"></td>
		</tr>
		<tr>
			<th>내 용</th>
			<td height="100"><textarea name="bcontent" rows="10" cols="45">${contentDto.bcontent }</textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
			<input type="submit" value="수정완료">
			<input type="button" value="취소" onclick="javascript:window.location='contentView?bid=${contentDto.bid }'">
			<input type="button" value="글목록" onclick="javascript:window.location='list'">
			</td>
		</tr>
	</form>
	</table>	
</body>
</html>