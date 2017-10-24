package org.itstep.test_data_collections;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.itstep.dao.pojo.Movie;
import org.itstep.dao.pojo.Seance;
import org.itstep.dao.pojo.constants.TypeD;

public final class Seances {
	public List<Seance> getList(){
		Date dateCurrent = new Date(System.currentTimeMillis());
		LocalDate datePlusOne = dateCurrent.toLocalDate().plusDays(2);
		LocalDate datePlusFive = dateCurrent.toLocalDate().plusDays(5);
		List<Movie> movies = Movies.getList();
		return Arrays.asList(
				new Seance(Date.valueOf(dateCurrent.toString()), new Time(11,00,00), TypeD.twoD, 2 , movies.get(0).getId()),
				new Seance(Date.valueOf(dateCurrent.toString()), new Time(15,40,00),TypeD.threeD, 3 , movies.get(1).getId()),
				
				new Seance(Date.valueOf(datePlusOne), new Time(11,00,00), TypeD.twoD, 2 , movies.get(0).getId()),
				new Seance(Date.valueOf(datePlusOne), new Time(17,50,00),TypeD.twoD, 4 , movies.get(2).getId()),
				
				new Seance(Date.valueOf(datePlusFive), new Time(10,40,00),TypeD.twoD, 5 , movies.get(1).getId()),
				new Seance(Date.valueOf(datePlusFive), new Time(15,40,00),TypeD.threeD, 3 , movies.get(2).getId())
		);
	}
}
