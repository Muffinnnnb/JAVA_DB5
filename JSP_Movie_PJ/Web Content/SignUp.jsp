<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ�� ����</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>
#input_form{display:inline-black; padding:35px; border:1px solid black;width:500px; height:490px;
			position:absolute; margin:-200px 0px 0px -200px; top:45%; left:45%; background-color:white;}
</style>
</head>
<body class="bg-dark">
<div style="padding:50px;">
<div id="input_form";>
<form method="post" action="./SignUpAction.jsp">
<br>
  <div class="form-group">
  <h1>ȸ������</h1><br>
    <label for="exampleInputEmail1">���̵�</label>
    <input type="text" class="form-control" name="id" id="exampleInputEmail1" placeholder="���̵� �Է�">    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">��й�ȣ</label>
    <input type="password" class="form-control" name="password" id="exampleInputPassword1" placeholder="��й�ȣ �Է�">
  </div>
    <div class="form-group">
    <label for="agee">����</label>
    <input type="text" class="form-control" name="age" id="agee" placeholder="���� �Է�">
  </div>
  <div style="text-align:right;">
  <br>
  <button type="submit" class="btn btn-outline-dark">ȸ������</button>
  </div>
</form>
</div>
</div>
</body>
</html>