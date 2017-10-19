package org.itstep.dao;

import org.itstep.dao.pojo.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionDAO extends JpaRepository<Session, Long>{

}
