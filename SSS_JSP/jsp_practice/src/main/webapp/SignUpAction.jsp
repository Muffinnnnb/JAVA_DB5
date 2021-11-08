<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%!private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	private PreparedStatement pstmt=null;

	String id = "";
	String password = "";
	String age = "";
%>
	<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@cyzhsss.iptime.org:1521:XE", "system",
			"1234");
	st = con.createStatement();
	%>
<%
	String id=request.getParameter("id");
	String password=request.getParameter("password");
	String age=request.getParameter("age");
	
	int born = Integer.parseInt(age);
%>
	<%
	try{
		pstmt=con.prepareStatement("insert into moviemember(id,pw,born) values(?,?,?)");
		
		pstmt.setString(1, id);
		pstmt.setString(2, password);
		pstmt.setInt(3, born);
		
		pstmt.executeUpdate();
		response.sendRedirect("./index.jsp");
	}catch(SQLException e){
		e.printStackTrace();
	}
	%>
</body>
</html>