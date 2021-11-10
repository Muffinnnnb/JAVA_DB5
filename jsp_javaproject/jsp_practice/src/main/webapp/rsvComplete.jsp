<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="dto.MovieVO" %>
<%@ page import="dao.MovieDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String title = request.getParameter("title");
String time = request.getParameter("time");
String age = request.getParameter("age");
String seat = request.getParameter("seat");
String id = (String)session.getAttribute("userId");
%>

<div style="border:1px">
<h1>예매가 완료되었습니다.</h1>
<ul>
	<li>제 목: <%=title %></li>
	<li>시 간: <%=time %></li>
	<li>나이제한: <%=age %></li>
	<li>좌석번호: <%=seat %>번 좌석</li>
</ul>
</div>
<%
MovieDAO dao2 = new MovieDAO();
dao2.UpdateReservation(id, title, time, seat);
%>
</body>
</html>