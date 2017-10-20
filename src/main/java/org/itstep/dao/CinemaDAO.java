package org.itstep.dao;

import org.itstep.dao.pojo.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaDAO extends JpaRepository<Cinema, Long>{

}
