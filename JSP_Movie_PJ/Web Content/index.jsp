<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style>
.view {
	text-align: center;
}
</style>
</head>
<body>
	<div id="wrap">
	<div style="text-align: right">
	<%Object userId = session.getAttribute("userId");%>
	<%if(userId==null){%><!-- �α����� �ȵ������� �α����ϱ� -->
		<button onClick="document.location.href='login.jsp'">�α����ϱ�</button>
		<button onClick="document.location.href='SignUp.html'">ȸ�������ϱ�</button>
		<br>
	<%} else {%><!-- �α����� �������� �α׾ƿ��ϱ� -->
		<button onClick="document.location.href='logoutAction.jsp'">�α׾ƿ�</button>
		<button onClick="document.location.href='logoutAction.jsp'">�� ��������</button>
	<%}%>
	</div>
		<h1 style="text-align: center">��õ��ȭ</h1>
		<div class="view">
			<img src="common.jfif">&nbsp;<img src="common.jfif">
			<hr>
		</div>
		<h2 style="text-align: center">������ ��ȭ</h2>
		<div class="view">
			<img src="common.jfif">&nbsp;<img src="common.jfif">&nbsp;<img
				src="common.jfif">&nbsp;<img src="common.jfif">&nbsp;<img
				src="common.jfif">
			<hr>
		</div>
		<br>
		<button onClick="document.location.href='reservation.jsp'">�����Ϸ�����</button>
		<br>

	</div>
</body>
</html>