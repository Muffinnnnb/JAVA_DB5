<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>logout</title>
</head>
<body>
	<%
	session.removeAttribute("userId");
	response.sendRedirect("./index.jsp");
	%>
</body>
</html>