<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���밪 ���ϱ�</title>
</head>
<body>
<%!
int num = 0;
int result=0;

public int abs(int num){
	if(num<0){
		return -num;
	}else
		return num;
}
%>

<%
num = -7;
result=abs(num);
out.print(num+"�� ���밪:"+result);
%>
</body>
</html>