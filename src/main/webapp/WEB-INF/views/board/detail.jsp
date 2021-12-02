<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>상세조회 페이지</h2>
	글번호 : ${board.b_number} <br>
	작성자 : ${board.b_writer} <br>
	조회수 : ${board.b_hits}<br>
	날짜 : ${board.b_date}<br>
	제목 : ${board.b_title}<br>
	내용 : ${board.b_contents}<br>
	<a href="/board/update?b_number=${board.b_number}">수정</a>
	<a href="/board/delete?b_number=${board.b_number}">삭제</a>
	<a href="/board/findAll?b_number=${board.b_number}">글목록으로</a>

</body>
</html>