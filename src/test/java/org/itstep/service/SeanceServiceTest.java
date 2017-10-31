package org.itstep.service;

import static org.junit.Assert.assertEquals;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.itstep.App;
import org.itstep.dao.pojo.Cinema;
import org.itstep.dao.pojo.Movie;
import org.itstep.dao.pojo.Seance;
import org.itstep.dao.pojo.constants.TypeD;
import org.itstep.data_for_testing.cinemas.Cinemas;
import org.itstep.data_for_testing.movies.Movies;
import org.itstep.data_for_testing.seanses.FlorenceSeances;
import org.itstep.data_for_testing.seanses.MultiplexProspectSeances;
import org.itstep.data_for_testing.seanses.MultiplexSkyMallSeances;
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
	
	private List<Seance> mSkyMallSeances;
	private List<Seance> mProspectSeances;
	private List<Seance> florenceSeances;
	
	private Cinema mSkymall;
	private Cinema mProspect;
	private Cinema florence;
	
	private Movie bladeRunner;
	private Movie pony;
	private Movie salut;
	
	@Before
	public void setData() {
		mSkyMallSeances = MultiplexSkyMallSeances.getList();
		mProspectSeances = MultiplexProspectSeances.getList();
		florenceSeances = FlorenceSeances.getList();
		
		List<Cinema> cinemas = Cinemas.getList();
		mSkymall = cinemas.get(0);
		mProspect = cinemas.get(1);
		florence = cinemas.get(3);
		
		List<Movie> movies = Movies.getList();
		bladeRunner = movies.get(0);
		pony = movies.get(1);
		salut = movies.get(2);
	}
	
	@Test
	public void test1CreateOrUpdate() {
		//cinemas
		cinemaService.createOrUpdate(mSkymall);
		cinemaService.createOrUpdate(mProspect);
		cinemaService.createOrUpdate(florence);
		
		//movies
		movieService.createOrUpdate(bladeRunner);
		movieService.createOrUpdate(pony);
		movieService.createOrUpdate(salut);
		
		//seanses of SkyMAll
		for (int i = 0; i < mSkyMallSeances.size(); i++) {
			if(i <5) {
				mSkyMallSeances.get(i).setMovie(bladeRunner);
			}else if(i>=5 && i<9) {
				mSkyMallSeances.get(i).setMovie(pony);
			}else {
				mSkyMallSeances.get(i).setMovie(salut);
			}
			mSkyMallSeances.get(i).setCinema(mSkymall);
			seanceService.createOrUpdate(mSkyMallSeances.get(i));	
		}
		
		//seanses of Prospect
		for (int i = 0; i < mProspectSeances.size(); i++) {
			if(i <5) {
				mProspectSeances.get(i).setMovie(bladeRunner);
			}else if(i>=5 && i<9) {
				mProspectSeances.get(i).setMovie(pony);
			}else {
				mProspectSeances.get(i).setMovie(salut);
			}
			mProspectSeances.get(i).setCinema(mSkymall);
			seanceService.createOrUpdate(mProspectSeances.get(i));	
		}
		
		//seanses of Florence
		for (int i = 0; i < florenceSeances.size(); i++) {
			if(i <3) {
				florenceSeances.get(i).setMovie(bladeRunner);
			}else if(i>=3 && i<5) {
				florenceSeances.get(i).setMovie(pony);
			}else {
				florenceSeances.get(i).setMovie(salut);
			}
			florenceSeances.get(i).setCinema(florence);
			seanceService.createOrUpdate(florenceSeances.get(i));	
		}
	}
	
	@Test
	public void test2FindByTypeD() {
		List<Seance> sencesInDb = seanceService.findByTypeD(TypeD.twoD);
		for (Seance seance : sencesInDb) {
			assertEquals(seance.getTypeD(), TypeD.twoD);
		}
	}
	
	@Test
	public void test3FindByMovie() {
		List<Seance> sencesInDb = seanceService.findByMovie(bladeRunner.getName());
		for (Seance seance : sencesInDb) {
			assertEquals(seance.getMovie().getName(), bladeRunner.getName());
		}
	}
	
	@Test
	public void test4FindByCinema() {
		List<Seance> sencesInDb = seanceService.findByCinema(florence.getName());
		for (Seance seance : sencesInDb) {
			assertEquals(seance.getCinema().getName(), florence.getName());
		}
	}
	
	@Test
	public void test5FindByDate() {
		Date date = Date.valueOf(new Date(System.currentTimeMillis()).toLocalDate().plusDays(1));
		List<Seance> sencesInDb = seanceService.findByDate(date);
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
