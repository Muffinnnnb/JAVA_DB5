<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>숫자 삼각형</title>
</head>
<body>
<%!
int arr[][]= new int[3][3];
int num=0;
%>
<%
for(int i=0;i<3;i++){
	for(int j=0;j<3-num;j++){
		arr[i][j]=j+1;
		out.print(arr[i][j]+" ");
	}
	num++;
	out.print("<br>");
}
%>
</body>
</html>