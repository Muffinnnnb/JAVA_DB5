<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>정보 수정</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
#input_form{display:inline-black; padding:25px; border:1px solid black;}
</style>
</head>
<body>
 <%
 String userId = request.getParameter("userId");
 
 %>
 
 <div id="input_form";>
<form method="post" action="./MyinfoUpdateAction.jsp?userId=<%=userId%>">
<br>
 <h1>정보 수정</h1><br>
  <p>아이디 : <%=userId %></p>
  <div class="form-group">
    <label for="exampleInputPassword1">비밀번호</label>
    <input type="password" class="form-control" name="password" id="exampleInputPassword1" placeholder="수정할 비밀번호 입력">
  </div>
    <div class="form-group">
    <label for="agee">나이</label>
    <input type="text" class="form-control" name="age" id="agee" placeholder="수정할 나이 입력">
  </div>
  <div style="text-align:right;">
  <button type="submit" class="btn btn-outline-dark">수정</button>
  </div>
</form>
</div>
</body>
</html>