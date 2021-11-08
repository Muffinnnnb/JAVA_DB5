package dto;

public class MemberDTO {
	private String ID;
	private String PW;
	private int BORN;
	
	public MemberDTO() {
		
	}
	
	public MemberDTO(String ID,String PW,int BORN) {
		this.ID=ID;
		this.PW=PW;
		this.BORN=BORN;
	}
	
	public void setID(String ID) {
		this.ID=ID;
	}
	public String getId() {
		return ID;
	}
	public void setPW(String PW) {
		this.PW=PW;
	}
	public String getPw() {
		return PW;
	}
	public void setBorn(int BORN) {
		this.BORN=BORN;
	}
	public int getBorn() {
		return BORN;
	}
}
