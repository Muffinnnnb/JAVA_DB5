<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� �ѷ� �� ���� ���ϱ�</title>
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
pw.printf("������ ���̰� %.1f�϶�", r);
pw.printf("<br>");
pw.printf("���� �ѷ�: %.1f",a);
pw.printf("<br>");
pw.printf("���� ����: %.1f",s);
pw.printf("<br>");
%>
</body>
</html>