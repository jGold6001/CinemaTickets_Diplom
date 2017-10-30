package org.itstep.data_for_testing.seanses;

import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;
import java.util.List;

import org.itstep.dao.pojo.Cinema;
import org.itstep.dao.pojo.Movie;
import org.itstep.dao.pojo.Seance;
import org.itstep.dao.pojo.constants.TypeD;
import org.itstep.data_for_testing.cinemas.Cinemas;
import org.itstep.data_for_testing.movies.Movies;

public final class TodaySeances {
	public static List<Seance> getList(){
		Date dateCurrent = new Date(System.currentTimeMillis());
		List<Cinema> cinemas = Cinemas.getList();
		List<Movie> movies = Movies.getList();
		
		Cinema mSkymall = cinemas.get(0);
		Cinema mProspect = cinemas.get(1);
		Cinema florence = cinemas.get(3);
		
		Movie bladeRunner = movies.get(0);
		Movie pony = movies.get(1);
		Movie salut = movies.get(2);
		
		return Arrays.asList(
				/*Multiplex SkyMall*/
				//---Бегущий по лезвию
				new Seance(mSkymall, bladeRunner, dateCurrent, new Time(11,00,00), TypeD.twoD, "1"),
				new Seance(mSkymall, bladeRunner, dateCurrent, new Time(12,00,00), TypeD.twoD, "1"),
				new Seance(mSkymall, bladeRunner, dateCurrent, new Time(16,40,00), TypeD.twoD, "1"),
				
				//---My Little Pony в кино
				new Seance(mSkymall, pony, dateCurrent, new Time(11,20,00), TypeD.threeD, "2"),
				new Seance(mSkymall, pony, dateCurrent, new Time(12,30,00), TypeD.threeD, "2"),
				new Seance(mSkymall, pony, dateCurrent, new Time(17,10,00), TypeD.threeD, "2"),
				new Seance(mSkymall, pony, dateCurrent, new Time(10,20,00), TypeD.twoD, "4"),
				new Seance(mSkymall, pony, dateCurrent, new Time(15,30,00), TypeD.twoD, "4"),
				new Seance(mSkymall, pony, dateCurrent, new Time(18,10,00), TypeD.twoD, "4"),
				
				//---Салют-7
				new Seance(mSkymall, salut, dateCurrent, new Time(11,10,00), TypeD.twoD, "3"),
				new Seance(mSkymall, salut, dateCurrent, new Time(14,00,00), TypeD.twoD, "3"),
				new Seance(mSkymall, salut, dateCurrent, new Time(17,00,00), TypeD.twoD, "3")
		);
	}
}
