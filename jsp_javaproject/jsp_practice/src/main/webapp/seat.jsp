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
<h1 style="text-align:center">�ڸ��� �����ϼ���.</h1>
<%!
ArrayList<MovieVO> dtos2;
MovieService service2 = new MovieService();
%>
<% 
String title = request.getParameter("title");
String time = request.getParameter("time");
String time2 = "12";

dtos2 = service2.ViewMovie(time);
for(int i =0;i<10;i++){
	out.println(i);
}

for(int i = 0;i<dtos2.size();i++){
	out.println("��ȭ����:"+dtos2.get(i).getTitle());
}
out.print("�ٺ�");
%>

<%=title %><%=time %>

</body>
</html>