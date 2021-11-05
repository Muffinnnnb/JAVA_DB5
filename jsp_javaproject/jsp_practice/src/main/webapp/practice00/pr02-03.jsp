<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>1~10000까지 8갯수 세기</title>
</head>
<body>
<%!
int num=0;
int count=0;
int digit=0;
%>
<%
for(int i =1;i<=10000;i++){
	num=i;
	while(num>0){
		digit=num%10;
		num=num/10;
		
		if(digit==8)
			count++;
	}
}
out.print("1~10000까지의, 8의 갯수:"+count);
%>
</body>
</html>