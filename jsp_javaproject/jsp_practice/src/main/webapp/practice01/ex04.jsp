<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
당신의 취미를 선택하십시오! <br>

<form method="get" action="ex04_1.jsp">

<select name="hobby">
<option value="등산" selected> 등산 </option>
<option value="낚시"> 낚시 </option>
<option value="여행"> 여행 </option>
<option value="독서"> 독서 </option>
<option value="운동"> 운동 </option>
<option value="기타"> 기타 </option>
</select><br>

<input type="submit" value="전송">
<input type="reset" value="취소">
</form>
</body>
</html>