package service;

import java.util.ArrayList;

import dao.MovieMemberDAO;
import dto.MovieMemberVO;

public class MovieMemberService {
	private MovieMemberDAO dao;

	public MovieMemberService() {
		dao = new MovieMemberDAO();
	}

	public ArrayList<MovieMemberVO> getAllMembers() {

		return dao.getAllMembers();
	}

	public ArrayList<MovieMemberVO> insertMovieMembers(String id, String pw,int born) {
		return dao.insertMovieMembers(id,pw,born);
	}

	public ArrayList<MovieMemberVO> DeleteMovieMembers(String id) {
		return dao.deleteMovieMembers(id);
	}
}
