<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ǥ��ü�� ���ϱ�</title>
</head>
<body>
<%!
char sex=0;
double height = 0;
double result = 0;

public double st_weight(char s,double h){
	if(s == 'm'){
		return (h-100)*0.9;
	}else
		return (h-100)*0.85;
}
%>
<%
sex='m';
height=170;
result=st_weight(sex,height);
out.print("����:"+sex+" Ű:"+height+" ǥ��ü��:"+result+"kg<br>");

sex='f';
height=160;
result=st_weight(sex,height);
out.print("����:"+sex+" Ű:"+height+" ǥ��ü��:"+result+"kg<br>");

%>
</body>
</html>