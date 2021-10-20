package service;

import java.util.ArrayList;

import dao.MovieMemberDAO;
import dto.MovieMemberVO;

public class MovieMemberService {
	private MovieMemberDAO dao;
	public MovieMemberService() {
		dao=new MovieMemberDAO();
	}
	public ArrayList<MovieMemberVO> getInform(){
		return dao.getInform();
	}
}
