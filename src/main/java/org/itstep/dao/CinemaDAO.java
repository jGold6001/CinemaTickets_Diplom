package org.itstep.dao;

import java.util.List;

import org.itstep.dao.pojo.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaDAO extends JpaRepository<Cinema, Long>{
	
	@Query(value="SELECT * FROM CINEMAS WHERE NAME = ?1",nativeQuery = true)
	Cinema findByName(String name);
	
	@Query(value="SELECT * FROM CINEMAS INNER JOIN ",nativeQuery = true)
	List<Cinema> findAllByCity(String cityName);
}
