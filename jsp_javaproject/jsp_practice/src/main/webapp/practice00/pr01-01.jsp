<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�ڱ�Ұ��ϱ�</title>
</head>
<body>
<%!String name="�����";
int age=30;
double height=182.5;%>

<%out.print("�� �̸��� "+name+"�Դϴ�."); 
out.print("<br>");
out.print("���̴� "+age+"�̰�");
out.print("<br>");
out.print("Ű�� "+height+"�Դϴ�.");%>
</body>
</html>