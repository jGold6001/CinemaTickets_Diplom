package org.itstep.service;

import java.sql.Date;
import java.util.List;

import org.itstep.dao.pojo.Session;

public interface SessionService {
	public Session getOne(long id);
	public Session createOrUpdate(Session session);
	public void delete(long id);
	public List<Session> getAll();
	public List<Session> findByTypeD(String typeD);
	public List<Session> findByMovie(String movieName);
	public List<Session> findByCinema(String cinemaName);
	public List<Session> findByDate(Date date);
	public boolean isUnique(long id);
}
