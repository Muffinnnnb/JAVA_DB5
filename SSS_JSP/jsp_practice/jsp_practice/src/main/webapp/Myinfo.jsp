<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="dto.MovieMemberVO"%>
<%@ page import="dto.MovieVO"%>
<%@ page import="service.MovieService"%>
<%@ page import="service.MovieMemberService"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<meta charset="EUC-KR">
<title>�� ����</title>
</head>
<body>
<%ArrayList<MovieMemberVO> dtos;
ArrayList<MovieVO> dtos2;
	MovieMemberService service = new MovieMemberService(); 
	MovieService service2 = new MovieService(); 
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
<h1 class="text-center">�� ���� ����</h1>
<br>
<div style="text-align:right; margin-right:20px;">
<button id="btn1" type="button" class="btn btn-outline-dark" onClick="document.location.href='MyinfoUpdate.jsp?userId=<%=userId%>'">���� ����</button>
<button id="btn2" type="button" class="btn btn-outline-dark" onClick="document.location.href='index.jsp'"> Ȩ </button>
</div>
<br>
<div class="container">
<table class="table table-striped text-center" style=" border:1px solid black;">
  <tbody>
    <tr>
      <th scope="row">���̵�</th>
      <td><%=userId %></td>
    </tr>
    <tr>
      <th scope="row">��й�ȣ</th>
      <td><%=pw %></td>
    </tr>
    <tr>
      <th scope="row">����</th>
      <td><%=born %></td>
    </tr>
  </tbody>
</table>

</div>
<div class="container">	
	<% dtos2=service2.getAllMovie();
	for(int i=0;i<dtos2.size();i++){
		if(i==0){%>
		<br>
			<h1 class="text-center">���� ����</h1>
			<br>
 <%	}
		if(dtos2.get(i).getId().equals(userId)){
			String title=dtos2.get(i).getTitle();
			String time =dtos2.get(i).getMovie_Time().substring(11,16);
			int seat=dtos2.get(i).getSeat(); %>
			
			
	<table class="table table-striped text-center" style=" border:1px solid black;">
  <tbody>
    <tr>
      <th scope="row">��ȭ����</th>
      <td><%=title %></td>
    </tr>
    <tr>
      <th scope="row">���۽ð�</th>
      <td><%=time %></td>
    </tr>
    <tr>
      <th scope="row">�¼���ȣ</th>
      <td><%=seat %></td>
    </tr>
  </tbody>
</table>					
	<%
		}
	}
	%>
	</div>
</body>
</html>