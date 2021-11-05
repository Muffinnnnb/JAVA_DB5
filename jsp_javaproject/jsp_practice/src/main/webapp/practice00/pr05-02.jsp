<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="MyPackage.Blood_Pressure" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>blood</title>
</head>
<body>
<%!
int result=0;
int bp_c=0;
int bp_r=0;
%>

<%
Blood_Pressure obj = new Blood_Pressure();

bp_c=110;
bp_r=70;

result=obj.BP_Check(bp_c,bp_r);

out.print("수축기 혈압:"+bp_c+" 이완기 혈압:"+bp_r+"<br>");
out.print("검사 결과:");

if(result==1){
	out.print("고혈압 입니다.");
}else if(result==2){
	out.print("전 고혈압 입니다.");
}else if(result==3){
	out.print("정상 입니다.");
}else{
	out.print("저혈압 입니다.");
}
%>
</body>
</html>