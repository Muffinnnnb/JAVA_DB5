<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� �� ���</title>
</head>
<body>
<!-- a�� ���� b�� ���� c�� ���� -->
<%!
double a=40;
double b=50;
double c=60;
double sum=a+b+c;
double avg=(a+b+c)/3;
%>
���� ���� <%=a %>��<br>

���� ���� <%=b %>��<br>

���� ���� <%=c %>��<br>

������ <%=sum %>�̰�<br>

����� <%=avg %>�̴�.

</body>
</html>