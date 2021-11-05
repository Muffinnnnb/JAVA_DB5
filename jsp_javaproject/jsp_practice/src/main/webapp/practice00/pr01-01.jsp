<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>자기소개하기</title>
</head>
<body>
<%!String name="신희욱";
int age=30;
double height=182.5;%>

<%out.print("제 이름은 "+name+"입니다."); 
out.print("<br>");
out.print("나이는 "+age+"이고");
out.print("<br>");
out.print("키는 "+height+"입니다.");%>
</body>
</html>