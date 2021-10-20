package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dto.MovieVO;

public class MovieDAO {
	private ArrayList<MovieVO> mdtos;
	private Connection con;
	private Statement st;
	private PreparedStatement pstmt;
	private ResultSet rs;

	public MovieDAO() {
		mdtos = new ArrayList<MovieVO>();
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

	public ArrayList<MovieVO> getAllMovie() {
		String SQL = "select * from movie";
		try {
			rs = st.executeQuery(SQL);
			while (rs.next()) {
				String title = rs.getString("title");
				int age_limit=rs.getInt("age_limit");
				String movie_time=rs.getString("movie_time");
				int seat=rs.getInt("seat");
				int reserved=rs.getInt("reserved");
				MovieVO VO = new MovieVO(title,age_limit,movie_time,seat,reserved);
				mdtos.add(VO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mdtos;
	}
}
