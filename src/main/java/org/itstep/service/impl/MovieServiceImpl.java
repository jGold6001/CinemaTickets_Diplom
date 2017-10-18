package org.itstep.service.impl;

import java.sql.Date;
import java.util.List;

import org.itstep.dao.MovieDAO;
import org.itstep.dao.pojo.Movie;
import org.itstep.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieDAO movieDAO;
	
	public Movie getOne(long id) {
		return movieDAO.getOne(id);
	}

	@Override
	public Movie getOne(String name) {
		return movieDAO.findByName(name);
	}

	public Movie createOrUpdate(Movie movie) {
		return movieDAO.saveAndFlush(movie);
	}

	public void delete(long id) {
		movieDAO.delete(id);
	}

	public List<Movie> getAll() {
		return movieDAO.findAll();
	}

	public List<Movie> findAllPremiere() {
		return movieDAO.findAllPremeries();
	}

	public boolean isUnique(long id) {
		if(movieDAO.findOne(id) !=null) {
			return false;
		}
		return true;
	}

	@Override
	public List<Movie> findAllComingSoon() {
		return movieDAO.findAllComingSoon();
	}

	@Override
	public List<Movie> findByDate(Date selectDate) {
		return movieDAO.findByDate(selectDate);
	}

	@Override
	public List<Movie> getAllByRankOrder() {
		return movieDAO.getAllByRankOrder();
	}
}
