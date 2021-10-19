package dto;

public class MovieMemberVO {
	private String id;
	private String pw;
	private String born;
	
	public MovieMemberVO(String id,String pw, String born) {
		this.id=id;
		this.pw=pw;
		this.born=born;

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
	public void setBorn(String born) {
		this.born=born;
	}
	public String getBorn() {
		return born;
	}

}
