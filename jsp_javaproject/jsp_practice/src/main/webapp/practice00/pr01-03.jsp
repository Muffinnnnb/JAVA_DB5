<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������� ȭ���� ��ȯ</title>
</head>
<body>
<%!
double c = 10;
double f;%>

<%
f=c*1.8+32;
%>

���� <%=c %>���� ȭ���� ���ΰ�?<br>
ȭ�� <%=f %>��
</body>
</html>