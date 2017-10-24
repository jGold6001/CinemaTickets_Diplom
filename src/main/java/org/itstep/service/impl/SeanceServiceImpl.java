package org.itstep.service.impl;

import java.sql.Date;
import java.util.List;

import org.itstep.dao.SeanceDAO;
import org.itstep.dao.pojo.Seance;
import org.itstep.service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeanceServiceImpl implements SeanceService {

	@Autowired
	private SeanceDAO seanceDAO; 
	
	@Override
	public Seance getOne(long id) {
		return seanceDAO.getOne(id);
	}

	@Override
	public Seance createOrUpdate(Seance seance) {
		return seanceDAO.saveAndFlush(seance);
	}

	@Override
	public void delete(long id) {
		seanceDAO.delete(id);
	}

	@Override
	public List<Seance> getAll() {
		return seanceDAO.findAll();
	}

	@Override
	public boolean isUnique(long id) {
		if(seanceDAO.findOne(id) != null) {
			return false;
		}
		return true;
	}

	@Override
	public List<Seance> findByTypeD(String typeD) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seance> findByMovie(String movieName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seance> findByCinema(String cinemaName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seance> findByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}
