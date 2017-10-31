package org.itstep.service;

import java.util.List;

import org.itstep.App;
import org.itstep.dao.pojo.Cinema;
import org.itstep.dao.pojo.Movie;
import org.itstep.dao.pojo.Seance;
import org.itstep.data_for_testing.cinemas.Cinemas;
import org.itstep.data_for_testing.movies.Movies;
import org.itstep.data_for_testing.seanses.TodaySeances;
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
	
	private List<Seance> todaySeances;
	private List<Cinema> cinemas;
	private List<Movie> movies;
	
	@Before
	public void setData() {
		todaySeances = TodaySeances.getList();
		movies = Movies.getList();
		cinemas = Cinemas.getList();
	}
	
	@Test
	public void test1CreateOrUpdate() {
		for (Cinema cinema : cinemas) {
			cinemaService.createOrUpdate(cinema);
		}
		
		for (Movie movie : movies) {
			movieService.createOrUpdate(movie);
		}
		
		Cinema mSkymall = cinemas.get(0);
		Cinema mProspect = cinemas.get(1);
		Cinema florence = cinemas.get(3);
		
		Movie bladeRunner = movies.get(0);
		Movie pony = movies.get(1);
		Movie salut = movies.get(2);
		
		for (int i = 0; i < todaySeances.size(); i++) {
			if(i<3) {
				todaySeances.get(i).setMovie(bladeRunner);
				todaySeances.get(i).setCinema(mSkymall);
			}else if(i>= 3 && i < 9) {
				todaySeances.get(i).setMovie(pony);
				todaySeances.get(i).setCinema(mSkymall);
			}else if(i>=9 && i <12){
				todaySeances.get(i).setMovie(salut);
				todaySeances.get(i).setCinema(mSkymall);
			}else if(i>=12 && i<15) {
				todaySeances.get(i).setMovie(bladeRunner);
				todaySeances.get(i).setCinema(mProspect);
			}else if(i>=15 && i<21) {
				todaySeances.get(i).setMovie(pony);
				todaySeances.get(i).setCinema(mProspect);
			}else if(i>=21 && i<24) {
				todaySeances.get(i).setMovie(salut);
				todaySeances.get(i).setCinema(mProspect);
			}else if(i>=24 && i<27) {
				todaySeances.get(i).setMovie(bladeRunner);
				todaySeances.get(i).setCinema(florence);
			}else if(i>=27 && i<30){
				todaySeances.get(i).setMovie(pony);
				todaySeances.get(i).setCinema(florence);
			}else {
				todaySeances.get(i).setMovie(salut);
				todaySeances.get(i).setCinema(florence);
			}
			seanceService.createOrUpdate(todaySeances.get(i));	
		}
	}
	
	@Test
	public void test2FindByTypeD() {
		
	}
	
	@Test
	public void test3FindByMovie() {
		
	}
	
	@Test
	public void test4FindByCinema() {
		
	}
	
	@Test
	public void test5FindByDate() {
		
	}
	
	@Test
	public void test6Delete() {
		List<Cinema> cinemasInDb = cinemaService.getAll();
		List<Movie> moviesInDb = movieService.getAll();
		List<Seance> seancesInDb = seanceService.getAll();
		
		for (Seance seance : seancesInDb) {
			seanceService.delete(seance.getId());
		}
		
		for (Cinema cinema : cinemasInDb) {
			cinemaService.delete(cinema.getId());
		}
		
		for (Movie movie : moviesInDb) {
			movieService.delete(movie.getId());
		}
	}
}
