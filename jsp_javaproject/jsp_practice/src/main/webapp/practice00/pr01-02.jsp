<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�μ��� ��Ģ����</title>
</head>
<body>
<%!
int num1=10;
int num2=20;%>

<%out.print(num1+"�� "+num2+"�� ������ "+(num1+num2)); %>
<%out.print("<br>"); %>
<%out.print(num1+"�� "+num2+"�� ������ "+(num1-num2)); %>
<%out.print("<br>"); %>
<%out.print(num1+"�� "+num2+"�� ������ "+(num1*num2)); %>
<%out.print("<br>"); %>
<%out.print(num1+"�� "+num2+"�� �������� "+(num1/num2)); %>
</body>
</html>