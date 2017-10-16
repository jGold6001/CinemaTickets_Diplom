package org.itstep.service;

import java.sql.Date;
import java.util.List;

import org.itstep.dao.pojo.Movie;

public interface MovieService {
	public Movie getOne(long id);
	public Movie getOne(String name);
	public Movie createOrUpdate(Movie movie);
	public void delete(long id);
	public List<Movie> getAll();
	public List<Movie> findAllPremiere(Date date);
	public boolean isUnique(long id);
}
