package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
			System.out.println("�����ͺ��̽� ���� ����:" + e.getMessage());
		}
	}

	public ArrayList<MovieMemberVO> getAllMembers() {
		String SQL = "SELECT * FROM MovieMember"; // ��üȸ����ȸ
		try {
			rs = st.executeQuery(SQL);
			while (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String born = rs.getString("born");
				MovieMemberVO VO = new MovieMemberVO(id, pw, born);
				dtos.add(VO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}

	public ArrayList<MovieMemberVO> insertMovieMembers(String id, String pw, String born) {
		String SQL = "INSERT INTO MovieMember (id,pw,born) values (?,?,?)";
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, born);
			pstmt.executeUpdate();
			System.out.println("���� �Ϸ�!");

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
