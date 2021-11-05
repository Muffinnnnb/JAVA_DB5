<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>2의 n제곱구하기</title>
</head>
<body>
<%!
public int square(int n){
	int a =1;
	for(int i =1;i<=n;i++){
		a*=2;
	}
	return a;
}
%>
<%
int num=10;
int result=square(10);
out.print("2의 "+num+"제곱은 "+result);
%>
</body>
</html>