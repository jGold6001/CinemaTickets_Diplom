package org.itstep.dao;

import org.itstep.dao.pojo.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceDAO extends JpaRepository<Place, Integer>{

}
