package org.itstep.service.impl;

import java.util.List;

import org.itstep.dao.CityDAO;
import org.itstep.dao.pojo.City;
import org.itstep.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

	@Autowired
	private CityDAO cityDAO;
	
	@Override
	public City getOne(long id) {
		return cityDAO.getOne(id);
	}

	@Override
	public City getOne(String name) {
		return cityDAO.findByName(name);
	}

	@Override
	public City createOrUpdate(City city) {
		return cityDAO.saveAndFlush(city);
	}

	@Override
	public void delete(long id) {
		cityDAO.delete(id);
	}

	@Override
	public List<City> getAll() {
		return cityDAO.findAll();
	}

	@Override
	public boolean isUnique(long id) {
		if(cityDAO.findOne(id) !=null) {
			return false;
		}
		return true;
	}

}
