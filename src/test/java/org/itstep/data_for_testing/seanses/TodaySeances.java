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
		return Arrays.asList(
				/*Multiplex SkyMall*/
				//---Бегущий по лезвию
				new Seance(dateCurrent, new Time(11,00,00), TypeD.twoD, "1"),
				new Seance(dateCurrent, new Time(12,00,00), TypeD.twoD, "1"),
				new Seance(dateCurrent, new Time(16,40,00), TypeD.twoD, "1"),				
				
				//---Салют-7
				new Seance(dateCurrent, new Time(11,10,00), TypeD.twoD, "3"),
				new Seance(dateCurrent, new Time(14,00,00), TypeD.twoD, "3"),
				new Seance(dateCurrent, new Time(17,00,00), TypeD.twoD, "3"),
				
				
					
				/*Multiplex Проспект*/
				//---Бегущий по лезвию
				new Seance(dateCurrent, new Time(11,10,00), TypeD.twoD, "2"),
				new Seance(dateCurrent, new Time(12,20,00), TypeD.twoD, "2"),
				new Seance(dateCurrent, new Time(16,40,00), TypeD.twoD, "2"),	
		
				//---Салют-7
				new Seance(dateCurrent, new Time(12,10,00), TypeD.twoD, "3"),
				new Seance(dateCurrent, new Time(14,00,00), TypeD.twoD, "3"),
				new Seance(dateCurrent, new Time(17,00,00), TypeD.twoD, "3"),
				
				
				/*Флоренция*/
				//---Бегущий по лезвию
				new Seance(dateCurrent, new Time(11,00,00), TypeD.twoD, "Малый"),
				new Seance(dateCurrent, new Time(12,00,00), TypeD.twoD, "Малый"),
				new Seance(dateCurrent, new Time(16,40,00), TypeD.twoD, "Малый"),	
				
				//---Салют-7
				new Seance(dateCurrent, new Time(11,10,00), TypeD.twoD, "Синий"),
				new Seance(dateCurrent, new Time(14,00,00), TypeD.twoD, "Синий"),
				new Seance(dateCurrent, new Time(17,00,00), TypeD.twoD, "Синий")
		);
	}
}
