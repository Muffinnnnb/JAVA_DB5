<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="MyPackage.Truck" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Ʈ��</title>
</head>
<body>
<%
Truck obj = new Truck("����",200,11.3,2000);
obj.Show_Info();
%>
</body>
</html>