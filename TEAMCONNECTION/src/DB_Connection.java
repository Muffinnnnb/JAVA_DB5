import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Connection {

	private Connection con;
	private Statement st;	
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public DB_Connection() {

		try {
			String user="system";
			String pw="1234";
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,user,pw);
			st=con.createStatement();
		}catch(Exception e) {
			System.out.println("데이터베이스 연결 오류:"+e.getMessage());
		}
	}
	
	public void Seat12() {
		String SQL="SELECT * FROM seat12 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void Seat15() {
		String SQL="SELECT * FROM seat15 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void Seat18() {
		String SQL="SELECT * FROM seat18 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void Seat21() {
		String SQL="SELECT * FROM seat21 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void bseat12() {
		String SQL="SELECT * FROM bseat12 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void bseat15() {
		String SQL="SELECT * FROM bseat15 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void bseat18() {
		String SQL="SELECT * FROM bseat18 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void bseat21() {
		String SQL="SELECT * FROM bseat21 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void cseat12() {
		String SQL="SELECT * FROM cseat12 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void cseat15() {
		String SQL="SELECT * FROM cseat15 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void cseat18() {
		String SQL="SELECT * FROM cseat18 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void cseat21() {
		String SQL="SELECT * FROM cseat21 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void dseat12() {
		String SQL="SELECT * FROM dseat12 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void dseat15() {
		String SQL="SELECT * FROM dseat15 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void dseat18() {
		String SQL="SELECT * FROM dseat18 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void dseat21() {
		String SQL="SELECT * FROM dseat21 order by seatnum asc";
		
		try {
			rs=st.executeQuery(SQL);
			
			while(rs.next()) {
				int seatnum = rs.getInt("seatnum");
				String note = rs.getString("note");
				System.out.printf("%d ", seatnum);
				System.out.printf("%s ", note);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public void Insert_Note12(int seatnum,int num) {
		String SQL = "insert into seat12(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	
	public void Insert_Note15(int seatnum,int num) {
		String SQL = "insert into seat15(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	
	public void Insert_Note18(int seatnum,int num) {
		String SQL = "insert into seat18(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	
	public void Insert_Note21(int seatnum,int num) {
		String SQL = "insert into seat21(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	public void Insert_Noteb12(int seatnum,int num) {
		String SQL = "insert into bseat12(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	public void Insert_Noteb15(int seatnum,int num) {
		String SQL = "insert into bseat15(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	public void Insert_Noteb18(int seatnum,int num) {
		String SQL = "insert into bseat18(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	public void Insert_Noteb21(int seatnum,int num) {
		String SQL = "insert into bseat21(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	public void Insert_Notec12(int seatnum,int num) {
		String SQL = "insert into cseat12(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	public void Insert_Notec15(int seatnum,int num) {
		String SQL = "insert into cseat15(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	public void Insert_Notec18(int seatnum,int num) {
		String SQL = "insert into cseat18(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	public void Insert_Notec21(int seatnum,int num) {
		String SQL = "insert into cseat21(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	public void Insert_Noted12(int seatnum,int num) {
		String SQL = "insert into dseat12(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	public void Insert_Noted15(int seatnum,int num) {
		String SQL = "insert into dseat15(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	public void Insert_Noted18(int seatnum,int num) {
		String SQL = "insert into dseat18(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
	public void Insert_Noted21(int seatnum,int num) {
		String SQL = "insert into dseat21(seatnum,note) values(?,?)";
		
		PreparedStatement pstmt=null;

		try {
			pstmt = con.prepareStatement(SQL);
			
			pstmt.setInt(1,seatnum);
			pstmt.setString(2, "매진");
			
			pstmt.executeUpdate();
			
			System.out.println("");
			System.out.printf("%d번자리를 예매하였습니다.", num);
			
		}catch(SQLException e) {
			System.out.println("");
			System.out.println("매진 되었습니다. ");
			System.out.println("처음부터 다시 입력하여 주십시오. ");
		}
	}
}
