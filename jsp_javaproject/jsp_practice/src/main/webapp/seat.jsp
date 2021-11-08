<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="dao.MovieDAO" %>
<%@ page import="java.util.*" %>
<%@ page import="dto.MovieVO" %>
<%@ page import="service.MovieService" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">자리를 선택하세요.</h1>
<%!
ArrayList<MovieVO> dtos2;
MovieService service2 = new MovieService();
%>
<% 
String title = request.getParameter("title");
String time = request.getParameter("time");

for(int i = 0;i<dtos2.size();i++){
	out.println("영화제목:"+dtos2.get(i).getTitle());
}

%>

<%=title %><%=time %>

</body>
</html>