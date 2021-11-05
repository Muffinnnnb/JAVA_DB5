<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>원의 둘레 및 넓이 구하기</title>
</head>
<body>
<%!
double r = 10;
double pi = 3.14;
double a =2*pi*r;
double s =pi*r*r;
%>

<%
PrintWriter pw = response.getWriter();
%>

<%
pw.printf("반지름 길이가 %.1f일때", r);
pw.printf("<br>");
pw.printf("원의 둘레: %.1f",a);
pw.printf("<br>");
pw.printf("원의 넓이: %.1f",s);
pw.printf("<br>");
%>
</body>
</html>