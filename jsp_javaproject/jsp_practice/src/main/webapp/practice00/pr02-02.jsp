<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>거꾸로 출력 및 각 자릿수의 합구하기</title>
</head>
<body>

<%! 
int num = 1234;
int digit = 0;
int sum=0;
%>
<%
out.print(num+"의 자릿수를 거꾸로 출력:");
while(num>0){
	digit=num%10;
	out.print(digit);
	sum += digit;
	num=num/10;
}
out.print("<br>");
out.print("자릿수의 합은 "+sum);

%>
</body>
</html>