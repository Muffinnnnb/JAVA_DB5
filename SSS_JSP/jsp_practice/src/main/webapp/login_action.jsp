<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="dao.MovieMemberDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login</title>
</head>
<body>
<%
String userId=request.getParameter("userId");
String password=request.getParameter("password");
		MovieMemberDAO dao=new MovieMemberDAO();
		boolean result=dao.memberSelect(userId,password);
		
		if(result==true){
			System.out.println("�α��� ����!");
			session.setAttribute("userId", userId);
			response.sendRedirect("index.jsp");
		} else {
			System.out.println("�α��� ����!");
%>
	<script>
	alert("ID�� ��й�ȣ�� �ٽ� Ȯ���� �ּ���.");
	history.back();
	</script>

<%
			//response.sendRedirect("./index.jsp");
		}
%>
</body>
</html>