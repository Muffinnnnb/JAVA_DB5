<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div>
<% 
String title = request.getParameter("title");
%>
	<h1 style="text-align:center">�ð��� �����ϼ���.</h1>
	
<a href="./seat.jsp?time=12&title=<%=title%>"><button>12��Ÿ��</button></a><br>
<a href="./seat.jsp?time=15&title=<%=title%>"><button>15��Ÿ��</button></a><br>
<a href="./seat.jsp?time=18&title=<%=title%>"><button>18��Ÿ��</button></a><br>
<%=title %>
	
</div>
</body>
</html>