package org.itstep.service;

import java.util.List;

import org.itstep.dao.pojo.City;

public interface CityService {
	public City getOne(long id);
	public City getOne(String name);
	public City createOrUpdate(City city);
	public void delete(long id);
	public List<City> getAll();
	public boolean isUnique(long id);
}
