<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%@ page import="java.util.ArrayList, java.util.Scanner,
dto.MovieMemberVO,
 dto.MovieVO,
 service.MovieMemberService,
 service.MovieService" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��ȭ ���� Ȩ</title>

<style>
.view {
	text-align: center;
}
body {
        height: 100vh;
        background-image: url('beach-g5d22e39b7_1920.jpg');
        background-repeat : no-repeat;
        background-size : cover;
      }
</style>
</head>
<body>

<%
ArrayList<MovieVO> dtos2; // ��ȭ������
MovieService service2 = new MovieService();
dtos2= service2.getAllMoviePoster();	//��ȭ ������ �������� ��ɾ�
%>


	<div id="wrap">
	<div style="text-align: right">
	<%Object userId = session.getAttribute("userId");%>
	<%if(userId==null){%><!-- �α����� �ȵ������� �α����ϱ� -->
		<button onClick="document.location.href='login.jsp'">�α���</button>
		<button onClick="document.location.href='SignUp.jsp'">ȸ������</button>
		<br>
	<%} else {%><!-- �α����� �������� �α׾ƿ��ϱ� -->
		<button onClick="document.location.href='logout.jsp'">�α׾ƿ�</button>
		<button type="button" onClick="document.location.href='Myinfo.jsp?userId=<%=userId%>'">�� ����</button>
	<%}%>
	</div>
		<h1 style="text-align: center">��õ��ȭ</h1>
		<div class="view">
			<img src="<%=dtos2.get(0).getPoster()%>" width="169" height="242">&nbsp;<img src="<%=dtos2.get(1).getPoster()%>" width="169" height="242">
			<hr>
		</div>
		<h2 style="text-align: center">������ ��ȭ</h2>
		<div class="view">					<!-- DB���� ��ȭ ������ URL �������� �ҽ��� Ȱ�� -->
			<img src="<%=dtos2.get(0).getPoster()%>" width="169" height="242">&nbsp;<img src="<%=dtos2.get(1).getPoster()%>" width="169" height="242">&nbsp;<img src="<%=dtos2.get(2).getPoster()%>" width="169" height="242">&nbsp;<img src="<%=dtos2.get(3).getPoster()%>" width="169" height="242">&nbsp;<img src="<%=dtos2.get(0).getPoster()%>" width="169" height="242">
			<hr>
		</div>
		<br>
	<%if(userId!=null) {%>
		<button onClick="document.location.href='movie.jsp'">�����Ϸ�����</button>
	<%} %>
		<button onClick="document.location.href='search.jsp'">��ȭ �˻�</button>
		<br>
	</div>
</body>
</html>