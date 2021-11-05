<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>총점 및 평균</title>
</head>
<body>
<!-- a는 국어 b는 영어 c는 수학 -->
<%!
double a=40;
double b=50;
double c=60;
double sum=a+b+c;
double avg=(a+b+c)/3;
%>
국어 점수 <%=a %>와<br>

영어 점수 <%=b %>와<br>

수학 점수 <%=c %>의<br>

총점은 <%=sum %>이고<br>

평균은 <%=avg %>이다.

</body>
</html>