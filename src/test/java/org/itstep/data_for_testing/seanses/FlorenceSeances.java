package org.itstep.data_for_testing.seanses;

import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;
import java.util.List;

import org.itstep.dao.pojo.Seance;
import org.itstep.dao.pojo.constants.TypeD;

public final class FlorenceSeances {
	public static List<Seance> getList(){
		Date dateCurrent = new Date(System.currentTimeMillis());
		Date datePlusOne = Date.valueOf(dateCurrent.toLocalDate().plusDays(1)); 
		Date datePlusTwo = Date.valueOf(dateCurrent.toLocalDate().plusDays(2));
		String bigHall = "Большой";
		String littleHall = "Малый";
		String redHall = "Крастный";
		String blueHall = "Синий";
		return Arrays.asList(
				//---Бегущий по лезвию
				new Seance(dateCurrent, new Time(11,00,00), TypeD.twoD, bigHall),
				new Seance(datePlusOne, new Time(11,00,00), TypeD.twoD, bigHall),
				new Seance(datePlusTwo, new Time(10,00,00), TypeD.twoD, bigHall),
				
				//---My Little Pony в кино
				new Seance(datePlusTwo, new Time(11,00,00), TypeD.threeD, redHall),
				new Seance(datePlusTwo, new Time(11,30,00), TypeD.twoD, littleHall),
				
				//---Салют-7	
				new Seance(dateCurrent, new Time(11,00,00), TypeD.twoD, blueHall),
				new Seance(datePlusOne, new Time(11,00,00), TypeD.twoD, blueHall),
				new Seance(datePlusTwo, new Time(11,00,00), TypeD.twoD, blueHall)
		);
		
	}
}
