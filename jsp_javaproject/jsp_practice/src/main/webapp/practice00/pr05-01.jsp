<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="MyPackage.Introduce" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�ڱ�Ұ�</title>
</head>
<body>
<%
Introduce obj = new Introduce();

out.print(obj.Intro("�̹�ȣ", 20, 178.5));
%>
</body>
</html>