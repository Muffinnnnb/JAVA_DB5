<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�ݾ׿� ���߱�</title>
</head>
<body>
<%!
int money=10000;

public boolean buy(int a,int b,int c){
	if(money==a*900+b*700+c*600){
		return true;
	}else{
		return false;
	}
}
%>
<%
out.print(money+"������ ���԰����� ���");
out.print("<br>");
for(int i =0;i<=money/900;i++){
	for(int j=0;j<=money/900;j++){
		for(int k=0;k<=money/900;k++){
			if(buy(i,j,k)==true){
			out.print("�� "+i+"�� �ݶ� "+j+"�� ���� "+k+"��");
			out.print("<br>");
			}
		}
	}
}
%>
</body>
</html>