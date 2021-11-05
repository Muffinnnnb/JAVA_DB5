<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="MyPackage.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>학생</title>
</head>
<body>
<%
Student obj[]= new Student[3];

obj[0]= new Student("이민호",26,4,3.7);
obj[1]= new Student("송중기",24,3,3.8);
obj[2]= new Student("정채연",21,2,3.3);

for(int i=0;i<=2;i++){
	obj[i].Show_info();
}
%>
</body>
</html>