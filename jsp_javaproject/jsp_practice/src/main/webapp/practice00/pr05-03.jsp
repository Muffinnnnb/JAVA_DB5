<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="MyPackage.function_2th" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>2차 함수</title>
</head>
<body>
<%!
int y=0;
int x=0;

int a=0;
int b=0;
int c=0;
%>
<%
a=1;
b=2;
c=3;
x=2;

function_2th obj = new function_2th();
out.print("f(x)=");

if(a==0){
	
}else{
	if(a==1){
		out.print("x^2+");
	}else{
		out.print(a+"*x^2+");
	}
}

if(b==0){
	
}else{
	if(b==1){
		out.print("x+");
	}else{
		out.print(b+"*x+");
	}
}

if(c==0){
	
}else{
	out.print(c);
}
out.print("<br>");
y=obj.f(a,b,c,x);
out.print("f("+x+")"+"="+y);

%>
</body>
</html>