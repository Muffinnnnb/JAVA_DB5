<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
String sports[] = request.getParameterValues("sports");
int size=sports.length;
out.println("당신이 좋아하는 스포츠는 아래와 같습니다.<br><br>");

for(int i =0;i<size;i++){
	out.println(sports[i]+"<br>");
}
%>
</body>
</html>