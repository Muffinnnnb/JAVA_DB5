package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.MovieMemberVO;
import dto.MovieMemberVO;
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
			String user = "system";
			String pw = "1234";
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, pw);
			st = con.createStatement();
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 오류:" + e.getMessage());
		}
	}

	public ArrayList<MovieMemberVO> getAllMembers() {
		String SQL = "SELECT * FROM MovieMember"; // db회원부분
		try {
			rs = st.executeQuery(SQL);
			while (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				MovieMemberVO VO = new MovieMemberVO(id, pw);
				dtos.add(VO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}

	public ArrayList<MovieMemberVO> insertMovieMembers(String id, String pw,String born) {
		String SQL = "INSERT INTO MovieMember (id,pw,born) values (?,?,?)"; // -----에 테이블명 입력해야됨
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, born);
			pstmt.executeUpdate();
			System.out.println("가입 완료!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}

	public ArrayList<MovieMemberVO> deleteMovieMembers(String id) {
		String SQL = "delete from MovieMember where id=? ";
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}
}
