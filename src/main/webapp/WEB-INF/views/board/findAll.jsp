<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <!-- JSTL(JSP Standard Tag Library) 사용 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<h2>글목록</h2>
	<table class="table table-dark table-striped">
		<tr>
			<th>글번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		<c:forEach items="${boardList}" var="board">
		<tr>
			<td>${board.b_number}</td>
			<td>${board.b_writer}</td>
			<td><a href="/board/detail?b_number=${board.b_number}">${board.b_title}</a></td>
			<td>${board.b_date}</td>
			<td>${board.b_hits}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>