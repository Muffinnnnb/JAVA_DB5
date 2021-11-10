<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="dto.MovieMemberVO"%>
<%@ page import="service.MovieMemberService"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<meta charset="EUC-KR">
<title>내 정보</title>
</head>
<body>
<%ArrayList<MovieMemberVO> dtos;
	MovieMemberService service = new MovieMemberService(); 
	%>
	<%
	String userId = request.getParameter("userId");
	String pw="";
	int born=0;
	dtos = service.getAllMembers();
	
	for (int i = 0; i < dtos.size(); i++) {
		if (dtos.get(i).getID().equals(userId)) {
			pw=dtos.get(i).getPW();
			born=dtos.get(i).getBorn();
			break;
		}
	}
	%>
	
	<br>
<h1 class="text-center">내 정보 보기</h1>
<br>
<div class="container">
<table class="table table-striped text-center" style=" border:1px solid black;">
  <tbody>
    <tr>
      <th scope="row">아이디</th>
      <td><%=userId %></td>
    </tr>
    <tr>
      <th scope="row">비밀번호</th>
      <td><%=pw %></td>
    </tr>
    <tr>
      <th scope="row">나이</th>
      <td><%=born %></td>
    </tr>
  </tbody>
</table>
<div style="text-align:right;">
<button type="button" class="btn btn-outline-dark" onClick="document.location.href='MyinfoUpdate.jsp?userId=<%=userId%>'">정보 수정</button>
<button type="button" class="btn btn-outline-dark" onClick="document.location.href='index.jsp'"> 홈 </button>
</div>
</div>
	
</body>
</html>