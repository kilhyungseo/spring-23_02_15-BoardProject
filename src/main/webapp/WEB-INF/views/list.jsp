<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글목록</title>
</head>
<body>
		<c:forEach items="${list }" var="bdto">
			${bdto.btitle }<br>
		
		
		</c:forEach>
		
	
</body>
</html>