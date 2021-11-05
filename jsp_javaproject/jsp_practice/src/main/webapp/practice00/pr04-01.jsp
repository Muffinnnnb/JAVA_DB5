<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>점수 평균</title>
</head>
<body>
<%!
double a[] ={10,20,30,40,50,60,70,80,90,100};
double b[]={1,2,3,4,5,6,7,8,9,10};
double avg=0;

public double allAvg(double n[]){
	double s=0;
		
	for(int i =0;i<10;i++){
		s+=n[i];
	}
	avg=s/10;
	return avg;
}
%>
<%
out.print("a점수: ");
for(int i=0;i<10;i++){
	out.print(a[i]+" ");
}
out.print("<br>");

avg=allAvg(a);
out.print("a반 평균:"+avg);
out.print("<br>");

out.print("b점수: ");
for(int i=0;i<10;i++){
	out.print(b[i]+" ");
}
out.print("<br>");

avg=allAvg(b);
out.print("b반 평균:"+avg);
out.print("<br>");
%>
</body>
</html>