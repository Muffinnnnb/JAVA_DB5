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

out.print("����� ����:"+bp_c+" �̿ϱ� ����:"+bp_r+"<br>");
out.print("�˻� ���:");

if(result==1){
	out.print("������ �Դϴ�.");
}else if(result==2){
	out.print("�� ������ �Դϴ�.");
}else if(result==3){
	out.print("���� �Դϴ�.");
}else{
	out.print("������ �Դϴ�.");
}
%>
</body>
</html>