<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�������� ��</title>
</head>
<body>
<%!
int sum=0;
int danSum=0;
%>
<%
for(int i =2;i<10;i++){
	for(int j =1;j<10;j++){
		sum+=i*j;
		danSum+=i*j;
	}
	out.print(i+"���� ��:"+danSum);
	out.print("<br>");
	danSum=0;
}
out.print("<br>");
out.print("��� ���� ��:"+sum);
%>

</body>
</html>