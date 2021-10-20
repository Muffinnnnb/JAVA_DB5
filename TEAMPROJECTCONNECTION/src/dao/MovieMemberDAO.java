package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.MovieMemberVO;

public class MovieMemberDAO {
	private ArrayList<MovieMemberVO> dtos;
	private Connection con;
	private Statement st;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public MovieMemberDAO() {
		dtos = new ArrayList<MovieMemberVO>();
		try {
			String user="system";
			String pw="1234";
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,user,pw);
			st=con.createStatement();
		}catch(Exception e) {
			System.out.println("데이터베이스 연결 오류"+e.getMessage());
		}	
	}

	public ArrayList<MovieMemberVO> getInform() {
		String SQL="SELECT * FROM movie ";
		try {
			rs=st.executeQuery(SQL);
			while(rs.next()) {	
				String title = rs.getString("title");
				int age_limit = rs.getInt("age_limit");
				int movie_time = rs.getInt("movie_time");
				int seat = rs.getInt("seat");
				MovieMemberVO VO=new MovieMemberVO(title,age_limit,movie_time,seat);
				dtos.add(VO);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
}
