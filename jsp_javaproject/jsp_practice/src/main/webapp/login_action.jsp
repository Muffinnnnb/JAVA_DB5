<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="dao.MovieMemberDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String userId=request.getParameter("userId");
String password=request.getParameter("password");
		MovieMemberDAO dao=new MovieMemberDAO();
		boolean result=dao.memberSelect(userId,password);
		
		if(result==true){
			System.out.println("�α��� ����!:���ǿ� �� ����!");
			session.setAttribute("userId", userId);
			response.sendRedirect("./movie.jsp");
		} else {
			System.out.println("�α��� ����!");
			response.sendRedirect("./index.jsp");
		}
%>
</body>
</html>