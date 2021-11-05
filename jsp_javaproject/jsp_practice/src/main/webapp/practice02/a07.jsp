<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%!
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	
	int Num=0;
	String Name="";
	String Manager="";
	
	String html_name="";
%>

<%
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection(
"jdbc:mysql://127.0.0.1:3306/mysql_db_test?serverTimezone=UTC&useSSL=false", 
"root", "1234");
st = con.createStatement();
%>

<%
request.setCharacterEncoding("EUC-KR");

String html_name = request.getParameter("name");
%>

<%
PreparedStatement pstmt = null;

String SQL = "delete FROM jsp_student where name =?";
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1,html_name);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.print("DB 데이터 삭제!");
	%>
</body>
</html>

