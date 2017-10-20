package org.itstep.dao;

import org.itstep.dao.pojo.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallDAO extends JpaRepository<Hall, Integer>{

}
