package org.itstep.dao;

import org.itstep.dao.pojo.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceDAO extends JpaRepository<Seance, Long>{

}
