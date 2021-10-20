package service;

import java.util.ArrayList;

import dao.MovieDAO;
import dto.MovieVO;

public class MovieService {
	private MovieDAO dao;

	public MovieService() {
		dao = new MovieDAO();
	}

	public ArrayList<MovieVO> getAllTitles() {

		return dao.getAllTitles();
	}

	public ArrayList<MovieVO> insertMovies(String title,int age_limit, String movie_time,int seat) {
		return dao.insertMovies(title, age_limit,movie_time,seat);
	}



}
