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
<title>Insert title here</title>

<style>
.view {
	text-align: center;
}
</style>
</head>
<body>

<%
ArrayList<MovieVO> dtos2; // 영화정보용
MovieService service2 = new MovieService();
dtos2= service2.getAllMoviePoster();	//영화 포스터 가져오는 명령어



%>


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
		<div class="view">					<!-- DB에서 영화 포스터 URL 가져오고 소스로 활용 -->
			<img src="<%=dtos2.get(0).getPoster()%>" width="169" height="242">&nbsp;<img src="<%=dtos2.get(1).getPoster()%>" width="169" height="242">&nbsp;<img src="<%=dtos2.get(2).getPoster()%>" width="169" height="242">&nbsp;<img src="<%=dtos2.get(3).getPoster()%>" width="169" height="242">&nbsp;<img src="<%=dtos2.get(0).getPoster()%>" width="169" height="242">
			<hr>
		</div>
		<br>
		<button onClick="document.location.href='reservation.jsp'">예매하러가기</button>
		<br>

	</div>
</body>
</html>