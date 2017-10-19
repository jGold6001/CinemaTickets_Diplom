package org.itstep.service;

import java.util.List;
import org.itstep.dao.pojo.Session;

public interface SessionService {
	public Session getOne(long id);
	public Session createOrUpdate(Session session);
	public void delete(long id);
	public List<Session> getAll();
	public boolean isUnique(long id);
}
