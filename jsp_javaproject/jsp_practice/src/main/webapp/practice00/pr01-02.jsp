<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>두수의 사칙연산</title>
</head>
<body>
<%!
int num1=10;
int num2=20;%>

<%out.print(num1+"과 "+num2+"의 덧셈은 "+(num1+num2)); %>
<%out.print("<br>"); %>
<%out.print(num1+"과 "+num2+"의 뺄셈은 "+(num1-num2)); %>
<%out.print("<br>"); %>
<%out.print(num1+"과 "+num2+"의 곱셈은 "+(num1*num2)); %>
<%out.print("<br>"); %>
<%out.print(num1+"과 "+num2+"의 나눗셈은 "+(num1/num2)); %>
</body>
</html>