package org.itstep.service.impl;

import java.util.List;

import org.itstep.dao.SessionDAO;
import org.itstep.dao.pojo.Session;
import org.itstep.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;

public class SessionServiceImpl implements SessionService {

	@Autowired
	private SessionDAO sessionDAO; 
	
	@Override
	public Session getOne(long id) {
		return sessionDAO.getOne(id);
	}

	@Override
	public Session createOrUpdate(Session session) {
		return sessionDAO.saveAndFlush(session);
	}

	@Override
	public void delete(long id) {
		sessionDAO.delete(id);
	}

	@Override
	public List<Session> getAll() {
		return sessionDAO.findAll();
	}

	@Override
	public boolean isUnique(long id) {
		if(sessionDAO.findOne(id) != null) {
			return false;
		}
		return true;
	}

}
