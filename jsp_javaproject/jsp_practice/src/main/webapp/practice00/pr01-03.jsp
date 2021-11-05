<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>섭씨에서 화씨로 변환</title>
</head>
<body>
<%!
double c = 10;
double f;%>

<%
f=c*1.8+32;
%>

섭씨 <%=c %>도는 화씨로 몇인가?<br>
화씨 <%=f %>도
</body>
</html>