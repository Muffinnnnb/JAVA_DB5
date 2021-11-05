<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>달팽이 모양</title>
</head>
<body>
<%!
int snail[][] = new int[10][10];
int data=0;
int x=0;
int y=0;
int add=0;
int num=0;
int i=0;
int row_col=0;
%>
<%
x=-1;
y=0;
add=1;
data=3;
row_col=data;
num=0;

while(data!=0){
	i=1;
	while(i<=data){
		x=x+add;
		snail[y][x]=num++;
		i++;
	}
	data--;
	i=1;
	while(i<=data)
	{
		y=y+add;
		snail[y][x]=num++;
		i++;
	}
	add=-add;
}
for(int i=0;i<row_col;i++){
	for(int j=0;j<row_col;j++){
		out.print(snail[i][j]+" ");
	}
	out.print("<br>");
}
%>
</body>
</html>