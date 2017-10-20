package org.itstep.dao;

import java.sql.Date;
import java.util.List;

import org.itstep.dao.pojo.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDAO extends JpaRepository<Movie, Long>{
	@Query(value="SELECT * FROM MOVIES WHERE NAME = ?1",nativeQuery = true)
	Movie findByName(String name);
	
	@Query(value = "SELECT * FROM MOVIES WHERE DATE_ISSUE <= NOW() AND (DATE_ISSUE+ INTERVAL '15' DAY) > NOW()", nativeQuery = true)
	List<Movie> findAllPremeries();
	
	@Query(value ="SELECT * FROM MOVIES WHERE DATE_ISSUE > NOW()", nativeQuery = true)
	List<Movie> findAllComingSoon();
	
//	@Query(value ="SELECT * FROM MOVIES WHERE ?1 >= DATE_ISSUE  AND ?1 < DATE_FINISH", nativeQuery = true)
//	List<Movie> findByDate(Date selectDate);
	
	@Query(value ="SELECT * FROM MOVIES ORDER BY RANK_SALES DESC", nativeQuery = true)
	List<Movie> getAllByRankOrder();
}
