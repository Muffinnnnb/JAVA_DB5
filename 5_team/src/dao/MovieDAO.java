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

import dto.MovieVO;
import dto.MovieVO;
import dto.MovieVO;

public class MovieDAO {
	private ArrayList<MovieVO> dtos;
	private Connection con;
	private Statement st;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public MovieDAO() {
		dtos = new ArrayList<MovieVO>();
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

	public ArrayList<MovieVO> getAllTitles() {
		String SQL = "SELECT * FROM Movie"; // 전체영화조회
		try {
			rs = st.executeQuery(SQL);
			while (rs.next()) {
				String title = rs.getString("title");
				int age_limit = rs.getInt("age_limit");
				String movie_time = rs.getString("movie_time");
				int seat = rs.getInt("seat");
				MovieVO VO = new MovieVO(title, age_limit, movie_time, seat);
				dtos.add(VO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}

	public ArrayList<MovieVO> insertMovies(String title,int age_limit, String movie_time,int seat) {
		String SQL = "INSERT INTO Movie (title, age_limit,movie_time,seat) values (?,?,?,?)";
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, title);
			pstmt.setInt(2, age_limit);
			pstmt.setString(3, movie_time);
			pstmt.setInt(4, seat);
			pstmt.executeUpdate();
			System.out.println("입력 완료!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dtos;
	}

}
