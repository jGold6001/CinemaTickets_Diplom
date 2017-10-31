package org.itstep.data_for_testing.seanses;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.itstep.dao.pojo.Seance;
import org.itstep.dao.pojo.constants.TypeD;

public final class AfterTomorrowSeances {
	public static List<Seance> getList(){
		LocalDate local = new Date(System.currentTimeMillis()).toLocalDate().plusDays(2);
		Date datePlusTwo = Date.valueOf(local);
return Arrays.asList(
				
				/*Multiplex SkyMall*/
				//---Бегущий по лезвию
				new Seance(datePlusTwo, new Time(11,00,00), TypeD.twoD, "1"),
				new Seance(datePlusTwo, new Time(12,00,00), TypeD.twoD, "1"),
				new Seance(datePlusTwo, new Time(16,40,00), TypeD.twoD, "1"),				
				//---My Little Pony в кино
				new Seance(datePlusTwo, new Time(11,20,00), TypeD.threeD, "2"),
				new Seance(datePlusTwo, new Time(12,30,00), TypeD.threeD, "2"),
				new Seance(datePlusTwo, new Time(17,10,00), TypeD.threeD, "2"),
				new Seance(datePlusTwo, new Time(10,20,00), TypeD.twoD, "4"),
				new Seance(datePlusTwo, new Time(15,30,00), TypeD.twoD, "4"),
				new Seance(datePlusTwo, new Time(18,10,00), TypeD.twoD, "4"),
				//---Салют-7
				new Seance(datePlusTwo, new Time(11,10,00), TypeD.twoD, "3"),
				new Seance(datePlusTwo, new Time(14,00,00), TypeD.twoD, "3"),
				new Seance(datePlusTwo, new Time(18,00,00), TypeD.twoD, "3"),
				
				
					
				/*Multiplex Проспект*/
				//---Бегущий по лезвию
				new Seance(datePlusTwo, new Time(11,10,00), TypeD.twoD, "2"),
				new Seance(datePlusTwo, new Time(12,20,00), TypeD.twoD, "2"),
				new Seance(datePlusTwo, new Time(16,40,00), TypeD.twoD, "2"),	
				//---My Little Pony в кино
				new Seance(datePlusTwo, new Time(11,20,00), TypeD.threeD, "6"),
				new Seance(datePlusTwo, new Time(12,30,00), TypeD.threeD, "6"),
				new Seance(datePlusTwo, new Time(10,20,00), TypeD.twoD, "7"),
				new Seance(datePlusTwo, new Time(15,30,00), TypeD.twoD, "7"),
				new Seance(datePlusTwo, new Time(18,10,00), TypeD.twoD, "7"),	
				//---Салют-7
				new Seance(datePlusTwo, new Time(12,10,00), TypeD.twoD, "3"),
				new Seance(datePlusTwo, new Time(14,00,00), TypeD.twoD, "3"),
				new Seance(datePlusTwo, new Time(17,00,00), TypeD.twoD, "3"),
				
				
				/*Флоренция*/
				//---Бегущий по лезвию
				new Seance(datePlusTwo, new Time(12,00,00), TypeD.twoD, "Малый"),
				new Seance(datePlusTwo, new Time(16,40,00), TypeD.twoD, "Малый"),	
				//---My Little Pony в кино
				new Seance(datePlusTwo, new Time(11,20,00), TypeD.threeD, "Большой"),
				new Seance(datePlusTwo, new Time(12,30,00), TypeD.threeD, "Большой"),
				new Seance(datePlusTwo, new Time(17,10,00), TypeD.threeD, "Большой"),	
				//---Салют-7
				new Seance(datePlusTwo, new Time(11,10,00), TypeD.twoD, "Синий"),
				new Seance(datePlusTwo, new Time(14,00,00), TypeD.twoD, "Синий"),
				new Seance(datePlusTwo, new Time(17,00,00), TypeD.twoD, "Синий"),
				new Seance(datePlusTwo, new Time(19,00,00), TypeD.twoD, "Синий")
		);
	}
}
