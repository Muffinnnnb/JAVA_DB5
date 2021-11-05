<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>완전수</title>
</head>
<body>
<%!
int sum=0;
public boolean perfect(int n){
	sum=0;
	for(int i=1;i<n;i++){
		if(n%i==0)
		{
			sum+=i;
		}
	}
	if(sum==n){
		return true;
	}else{
		return false;
	}
}
%>
<%
for(int j=1; j<=1000;j++){
	if(perfect(j)==true){
		out.print(j+" ");
		out.print("<br>");
	}
}
%>
</body>
</html>