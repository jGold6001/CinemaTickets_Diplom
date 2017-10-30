package org.itstep.service.impl;

import java.util.List;

import org.itstep.dao.CinemaDAO;
import org.itstep.dao.pojo.Cinema;
import org.itstep.service.CinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CinemaServiceImpl implements CinemaService {

	@Autowired
	private CinemaDAO cinemaDAO;
	
	@Override
	public Cinema getOne(long id) {
		return cinemaDAO.getOne(id);
	}

	@Override
	public Cinema createOrUpdate(Cinema cinema) {
		return cinemaDAO.saveAndFlush(cinema);
	}

	@Override
	public void delete(long id) {
		cinemaDAO.delete(id);
	}

	@Override
	public List<Cinema> getAll() {
		return cinemaDAO.findAll();
	}
	
	@Override
	public Cinema getOne(String name) {
		return cinemaDAO.findByName(name);
	}

	@Override
	public List<Cinema> getAllByCity(String cityName) {
		return cinemaDAO.findAllByCity(cityName);
	}

	@Override
	public boolean isUnique(long id) {
		if(cinemaDAO.findOne(id) !=null) {
			return false;
		}
		return true;
	}

}
