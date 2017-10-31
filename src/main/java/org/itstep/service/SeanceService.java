package org.itstep.service;

import java.sql.Date;
import java.util.List;

import org.itstep.dao.pojo.Seance;


public interface SeanceService {
	public Seance getOne(long id);
	public Seance createOrUpdate(Seance seance);
	public void delete(long id);
	public List<Seance> getAll();
	public List<Seance> findByTypeD(String typeD);
	public List<Seance> findByMovie(String movieName);
	public List<Seance> findByCinema(String cinemaName);
	public List<Seance> findByDate(Date date);
	public boolean isUnique(long id);
}
