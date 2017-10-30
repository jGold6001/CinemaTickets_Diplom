package org.itstep.service;

import java.util.List;

import org.itstep.App;
import org.itstep.dao.pojo.Cinema;
import org.itstep.dao.pojo.Movie;
import org.itstep.dao.pojo.Seance;
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
public class SeanceServiceTest {

	@Autowired
	private SeanceService seanceService; 
	
	@Autowired
	private CinemaService cinemaService;
	
	@Autowired 
	private MovieService movieService;
	
	private List<Seance> seances;
	private List<Cinema> cinemas;
	private List<Movie> movies;
	
	
	@Before
	public void setData() {
		
		
	}
	
	@Test
	public void test() {
		
	}
}
