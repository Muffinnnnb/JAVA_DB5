<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Ųٷ� ��� �� �� �ڸ����� �ձ��ϱ�</title>
</head>
<body>

<%! 
int num = 1234;
int digit = 0;
int sum=0;
%>
<%
out.print(num+"�� �ڸ����� �Ųٷ� ���:");
while(num>0){
	digit=num%10;
	out.print(digit);
	sum += digit;
	num=num/10;
}
out.print("<br>");
out.print("�ڸ����� ���� "+sum);

%>
</body>
</html>