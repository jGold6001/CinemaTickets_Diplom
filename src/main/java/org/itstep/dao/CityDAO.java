package org.itstep.dao;

import org.itstep.dao.pojo.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDAO extends JpaRepository<City, Long>{
	
	@Query(value="SELECT * FROM CITIES WHERE NAME = ?1",nativeQuery = true)
	City findByName(String name);
}
