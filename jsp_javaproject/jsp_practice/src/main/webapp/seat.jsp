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
<h1 style="text-align:center">자리를 선택하세요.</h1>

<%
MovieDAO dao2 = new MovieDAO();
ArrayList<MovieVO> dtos2;

request.setCharacterEncoding("UTF-8");
String title = request.getParameter("title");
String time = request.getParameter("time");

%>
<%=title %><%=time %>
<%
dtos2= dao2.ViewMovie(title,time);
for(int i =0;i<dtos2.size();i++){
	MovieVO arr = dtos2.get(i);
	String Title = arr.getTitle();
	int age= arr.getAge_Limit();
	String Time =arr.getMovie_Time();
	
	out.println("제목: "+Title+"<br>");
	out.println("나이제한: "+age+"<br>");
	out.println("시간: "+Time+"<br><br>");
}
%>


</body>
</html>