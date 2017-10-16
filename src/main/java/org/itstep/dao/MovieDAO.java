package org.itstep.dao;

import org.itstep.dao.pojo.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDAO extends JpaRepository<Movie, Long>{
//	@Query(value = "SELECT * FROM MOVIES WHERE DATE_ISSUE >= ?1 AND DATE_ISSUE <= ?1", nativeQuery = true)
//	List<Movie> findAllPremeriesByDates(Date dateIssue);
	
	@Query(value="SELECT * FROM MOVIES WHERE NAME = ?1",nativeQuery = true)
	Movie findByName(String name);
	
}
