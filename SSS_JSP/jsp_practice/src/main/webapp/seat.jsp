<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 
String title = request.getParameter("title");
String time = request.getParameter("time");

%>
<h1 style="text-align:center">�ڸ��� �����ϼ���.</h1>

<%=title %><%=time %>

</body>
</html>