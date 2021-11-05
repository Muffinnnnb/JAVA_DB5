<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="MyPackage.Introduce" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>자기소개</title>
</head>
<body>
<%
Introduce obj = new Introduce();

out.print(obj.Intro("이민호", 20, 178.5));
%>
</body>
</html>