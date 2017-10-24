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
		LocalDate datePlusOne = dateCurrent.toLocalDate().plusDays(1);
		LocalDate datePlusTwo = dateCurrent.toLocalDate().plusDays(2);
		List<Movie> movies = Movies.getList();
		return Arrays.asList(
				new Seance(Date.valueOf(dateCurrent.toString()), new Time(11,00,00), TypeD.twoD),
				new Seance(Date.valueOf(dateCurrent.toString()), new Time(12,40,00),TypeD.threeD),
				new Seance(Date.valueOf(dateCurrent.toString()), new Time(15,40,00),TypeD.twoD),
				
				new Seance(Date.valueOf(datePlusOne), new Time(11,00,00), TypeD.twoD),
				new Seance(Date.valueOf(datePlusOne), new Time(12,40,00),TypeD.threeD),
				new Seance(Date.valueOf(datePlusOne), new Time(16,40,00),TypeD.twoD),
				
				new Seance(Date.valueOf(datePlusTwo), new Time(11,00,00),TypeD.twoD),
				new Seance(Date.valueOf(datePlusTwo), new Time(15,40,00),TypeD.twoD),
				new Seance(Date.valueOf(datePlusTwo), new Time(19,30,00),TypeD.threeD)
		);
	}
}
