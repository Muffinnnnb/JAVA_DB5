<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���� ����</title>
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
 <h1>���� ����</h1><br>
  <p>���̵� : <%=userId %></p>
  <div class="form-group">
    <label for="exampleInputPassword1">��й�ȣ</label>
    <input type="password" class="form-control" name="password" id="exampleInputPassword1" placeholder="������ ��й�ȣ �Է�">
  </div>
    <div class="form-group">
    <label for="agee">����</label>
    <input type="text" class="form-control" name="age" id="agee" placeholder="������ ���� �Է�">
  </div>
  <div style="text-align:right;">
  <button type="submit" class="btn btn-outline-dark">����</button>
  </div>
</form>
</div>
</body>
</html>