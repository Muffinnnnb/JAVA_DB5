<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%Object userID = session.getAttribute("userID");%>
	
	<%if (userID == null) {%>
	표를 구입하실려면 로그인이 필요합니다.
	<br>
	<button onClick="document.location.href='login.jsp'">로그인하기</button>
	<br>
	<button onClick="document.location.href='SignUp.html'">회원가입하기</button>
	<br>
	<button onClick="document.location.href='index.jsp'">취소하기</button>
	<br>
	<%} else {%>
	
	<%}%>
</body>
</html>