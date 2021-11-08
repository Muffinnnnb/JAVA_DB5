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
	<%if(userId==null){%><!-- 로그인이 안돼잇으면 로그인하기 -->
		<button onClick="document.location.href='login.jsp'">로그인하기</button>
		<button onClick="document.location.href='SignUp.html'">회원가입하기</button>
		<br>
	<%} else {%><!-- 로그인이 돼잇으면 로그아웃하기 -->
		<button onClick="document.location.href='logoutAction.jsp'">로그아웃</button>
		<button onClick="document.location.href='logoutAction.jsp'">내 정보보기</button>
	<%}%>
	</div>
		<h1 style="text-align: center">추천영화</h1>
		<div class="view">
			<img src="common.jfif">&nbsp;<img src="common.jfif">
			<hr>
		</div>
		<h2 style="text-align: center">상영중인 영화</h2>
		<div class="view">
			<img src="common.jfif">&nbsp;<img src="common.jfif">&nbsp;<img
				src="common.jfif">&nbsp;<img src="common.jfif">&nbsp;<img
				src="common.jfif">
			<hr>
		</div>
		<br>
		<button onClick="document.location.href='reservation.jsp'">예매하러가기</button>
		<br>

	</div>
</body>
</html>