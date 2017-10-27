package org.itstep.service;

import java.util.List;

import org.itstep.dao.pojo.Cinema;

public interface CinemaService {
	public Cinema getOne(long id);
	public Cinema getOne(String name);
	public Cinema createOrUpdate(Cinema cinema);
	public void delete(long id);
	public List<Cinema> getAll();
	public List<Cinema> getAllByCity(String cityName);
	public boolean isUnique(long id);
}
