<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>1~100������ ¦���� �� Ȧ����</title>
</head>
<body>
<%!
int even_sum=0;
int	odd_sum=0;
%>
<%
for(int i =1;i<=100;i++){
	if(i%2==0){
		even_sum+=i;
	}else{
		odd_sum+=i;
	}
}
out.print("¦���� ��:"+even_sum);
out.print("<br>");
out.print("Ȧ���� ��:"+odd_sum);
%>
</body>
</html>