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
	ǥ�� �����ϽǷ��� �α����� �ʿ��մϴ�.
	<br>
	<button onClick="document.location.href='login.jsp'">�α����ϱ�</button>
	<br>
	<button onClick="document.location.href='SignUp.html'">ȸ�������ϱ�</button>
	<br>
	<button onClick="document.location.href='index.jsp'">����ϱ�</button>
	<br>
	<%} else {%>
	
	<%}%>
</body>
</html>