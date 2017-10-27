package org.itstep.service;

import java.util.List;

import org.itstep.App;
import org.itstep.dao.pojo.City;
import org.itstep.test_data_collections.Cities;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CityServiceTest {

	@Autowired 
	private CityService cityService;
	
	City city;
	
	@Before
	public void setData() {
		city = Cities.getCities().get(0);
	}
	
	@Test
	public void test1CreateOrUpdate() {
		 cityService.createOrUpdate(city);
	}
	
	@Test
	public void test2GetOneStringAndDelete() {
		City cityInDb = cityService.getOne(city.getName());
		cityService.delete(cityInDb.getId());
	}
}
