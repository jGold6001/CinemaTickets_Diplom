package org.itstep.dao;

import java.util.List;

import org.itstep.dao.pojo.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceDAO extends JpaRepository<Seance, Long>{
	
	@Query(value="SELECT * FROM SEANCES WHERE TYPE_D = ?1",nativeQuery = true)
	List<Seance> findByTypeD(String typeD);
	
	@Query(value="SELECT * FROM SEANCES WHERE DATE = ?1", nativeQuery = true)
	List<Seance> findByDate(String dateStr);
	
	@Query(value="SELECT * FROM SEANCES INNER JOIN MOVIES ON SEANCES.MOVIE_ID = MOVIES.ID AND MOVIES.NAME = ?1", nativeQuery = true)
	List<Seance> findByMovie(String movieName);
	
	@Query(value="SELECT * FROM SEANCES INNER JOIN CINEMAS ON SEANCES.CINEMA_ID = CINEMAS.ID AND CINEMAS.NAME = ?1", nativeQuery = true)
	List<Seance> findByCinema(String cinemaName);
}
