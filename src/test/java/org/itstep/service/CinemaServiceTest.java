package org.itstep.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.itstep.App;
import org.itstep.dao.pojo.Cinema;
import org.itstep.dao.pojo.City;
import org.itstep.data_for_testing.cinemas.Cinemas;
import org.itstep.data_for_testing.cities.Cities;
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
public class CinemaServiceTest {

	@Autowired
	private CinemaService cinemaService;
	
	@Autowired
	private CityService cityService;
	
	private List<Cinema> cinemas;
	private Cinema cinema;
	private List<City> cities;
	
	@Before
	public void setData() {
		cinemas = Cinemas.getList();
		cinema = cinemas.get(0);
		cities = Cities.getList();
	}
	
	@Test
	public void test1CreateOrUpdate() {
		City kiev = cities.get(0);
		City kharkov= cities.get(1);;
		cityService.createOrUpdate(kiev);
		cityService.createOrUpdate(kharkov);
		for (Cinema cinema : cinemas) {
			if(cinema.getName() == cinemas.get(2).getName()) {
				cinema.setCity(kharkov);
			}else {
				cinema.setCity(kiev);
			}
			cinemaService.createOrUpdate(cinema);
		}
	}
	
	@Test
	public void test2GetOneString() {
		Cinema cinemaInDb = cinemaService.getOne(cinema.getName());
		assertEquals(cinemaInDb.getName(), cinema.getName());
	}

	@Test
	public void test3GetAll() {
		 List<Cinema> cinemasInDb = cinemaService.getAll();
		 assertEquals(cinemasInDb.get(0).getName(), cinemas.get(0).getName());
	}

	@Test
	public void test4GetAllByCity() {
		City kharkov = cities.get(1);
		List<Cinema> cinemasInKharkov  = cinemaService.getAllByCity(kharkov.getName());
		assertEquals(cinemasInKharkov.get(0).getCity().getName(), kharkov.getName());
		
	}
	
	@Test
	public void test5Delete() {
		List<City> citiesInDb = cityService.getAll();
		for (City city : citiesInDb) {
			cityService.delete(city.getId());
		}
		
		List<Cinema> cinemasInDb = cinemaService.getAll();
		for (Cinema cinema : cinemasInDb) {
				cinemaService.delete(cinema.getId());
		}
		
	}
}
