package dto;

public class MovieMemberVO {
	private String id;
	private String pw;
	
	public MovieMemberVO(String id,String pw) {
		this.id=id;
		this.pw=pw;

	}
	public void setID(String id) {
		this.id=id;
	}
	public String getID() {
		return id;
	}
	public void setPW(String pw) {
		this.pw=pw;
	}
	public String getPW() {
		return pw;
	}

}
