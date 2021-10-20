package dto;

public class MovieMemberVO {
	
	private String title;
	private int age_limit;
	private int movie_time;
	private int seat;
	
	public MovieMemberVO(String title,int age_limit, int movie_time,int seat) {
		this.title=title;
		this.age_limit=age_limit;
		this.movie_time=movie_time;
		this.seat=seat;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setAge_limit(int age_limit) {
		this.age_limit=age_limit;
	}
	public int getAge_limit() {
		return age_limit;
	}
	public void setMovie_time(int movie_time) {
		this.movie_time=movie_time;
	}
	public int getMovie_time() {
		return movie_time;
	}
	public void setSeat(int seat) {
		this.seat=seat;
	}
	public int getSeat() {
		return seat;
	}
}
