<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>while 중첩 Example</h1>
<p>반복문의 단골손님 구구단 출력!<p>
<%!
int dan=2;
int num=1;
%>
<%
while(dan<=9)
{
	num=1;
	while(num<=9)
	{
		out.print(dan+"x"+num+"="+dan*num);
		num++;
		out.print("<br>");
		
	}
	out.print("<br>");
	dan++;
}
%>
</body>
</html>