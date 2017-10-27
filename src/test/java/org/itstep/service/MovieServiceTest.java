package org.itstep.service;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import org.itstep.App;
import org.itstep.dao.pojo.Movie;
import org.itstep.test_data_collections.Movies;
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
public class MovieServiceTest {

	@Autowired
	private MovieService movieService;
	
	private List<Movie> movies;
	private Movie movie;
	private Date dateCurrent;

	
	@Before
	public void setData() {
		dateCurrent = new Date(System.currentTimeMillis());
		movies = Movies.getList();
		movie = movies.get(0);
	}
	
	@Test
	public void test0IsDataInDb() {
		List<Movie> moviesIndDb = movieService.getAll();
		if(!moviesIndDb.isEmpty()) {
			for (Movie movie : moviesIndDb) {
				movieService.delete(movie.getId());
			}
			System.out.println("Data from db were delete");
		}
	}
	
	@Test
	public void test1CreateOrUpdate() {
		Movie movieInDb = movieService.createOrUpdate(movie);
		assertEquals(movie.getId(), movieInDb.getId());
	}

	@Test
	public void test2GetOne() {
		Movie movieInDb = movieService.getOne(movie.getName());
		assertEquals(movie.getName(), movieInDb.getName());
	}
	
	@Test
	public void test3FindAllPremiere() {
		 movieService.createOrUpdate(movies.get(1));
		 movieService.createOrUpdate(movies.get(2));
		 List<Movie> listInDb = movieService.findAllPremiere();
		 assertEquals(movies.get(2).getName(), listInDb.get(0).getName());
	}
	
	@Test
	public void test4FindAllComingSoon() {
		 List<Movie> listInDb = movieService.findAllComingSoon();
		 assertEquals(movies.get(1).getName(), listInDb.get(0).getName());
	}
	
	
	@Test
	public void test5GetAllByRankOrder() {
		List<Movie> listInDb = movieService.getAllByRankOrder();
		assertEquals(listInDb.get(0).getRankSales(), 5);
		assertEquals(listInDb.get(1).getRankSales(), 2);
		assertEquals(listInDb.get(2).getRankSales(), 1);
	}
	
	
	@Test
	public void test7GetAllAndDelete() {
		List<Movie> listInDb = movieService.getAll();
		for (Movie movie : listInDb) {
			movieService.delete(movie.getId());
		}
	}



}
