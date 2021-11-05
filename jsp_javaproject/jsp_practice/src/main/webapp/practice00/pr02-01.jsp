<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>1부터 30까지의 소수구하기</title>
</head>
<body>
<%
int count = 0;
%>
<%
for(int i =2;i<31;i++){
	for(int j = 2;j<31;j++){
		if(i<j)
			break;	
		if(i%j==0){
			count += 1;
		}
	}
	
	if(count == 1){
		out.print(i+" ");
	}
	count = 0;
}
%>
</body>
</html>