<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, java.util.Scanner,
dto.MovieMemberVO,
 dto.MovieVO,
 service.MovieMemberService,
 service.MovieService" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<MovieVO> dtos2;
MovieService service2 = new MovieService();
dtos2= service2.getAllMoviePoster();
%>

<div>
<b>인셉션</b><br>
<img src="<%=dtos2.get(0).getPoster()%>" width="169" height="242">
<form action="time.jsp" method="post">
<input type="hidden" name="title" value="인셉션">
<input type="submit" value="시간보기">
</form>

<b>겨울왕국</b><br>
<img src="<%=dtos2.get(1).getPoster()%>" width="169" height="242">
<form action="time.jsp" method="post">
<input type="hidden" name="title" value="겨울왕국">
<input type="submit" value="시간보기">
</form>
</div>

<b>킹스맨</b><br>
<img src="<%=dtos2.get(2).getPoster()%>" width="169" height="242">
<form action="time.jsp" method="post">
<input type="hidden" name="title" value="킹스맨">
<input type="submit" value="시간보기">
</form>

<b>기생충</b><br>
<img src="<%=dtos2.get(3).getPoster()%>" width="169" height="242">
<form action="time.jsp" method="post">
<input type="hidden" name="title" value="기생충">
<input type="submit" value="시간보기">
</form>



</body>
</html>