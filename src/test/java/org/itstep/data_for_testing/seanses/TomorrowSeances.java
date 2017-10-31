package org.itstep.data_for_testing.seanses;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.itstep.dao.pojo.Seance;
import org.itstep.dao.pojo.constants.TypeD;

public final class TomorrowSeances {
	public static List<Seance> getList(){
		LocalDate local = new Date(System.currentTimeMillis()).toLocalDate().plusDays(1);
		Date datePlusOne = Date.valueOf(local);
		return Arrays.asList(
				
				/*Multiplex SkyMall*/
				//---Бегущий по лезвию
				new Seance(datePlusOne, new Time(11,00,00), TypeD.twoD, "1"),
				new Seance(datePlusOne, new Time(12,00,00), TypeD.twoD, "1"),
				new Seance(datePlusOne, new Time(16,40,00), TypeD.twoD, "1"),				
				
				//---Салют-7
				new Seance(datePlusOne, new Time(11,10,00), TypeD.twoD, "3"),
				new Seance(datePlusOne, new Time(14,00,00), TypeD.twoD, "3"),
				new Seance(datePlusOne, new Time(18,00,00), TypeD.twoD, "3"),
				
				
					
				/*Multiplex Проспект*/
				//---Бегущий по лезвию
				new Seance(datePlusOne, new Time(11,10,00), TypeD.twoD, "2"),
				new Seance(datePlusOne, new Time(12,20,00), TypeD.twoD, "2"),
				new Seance(datePlusOne, new Time(16,40,00), TypeD.twoD, "2"),	
				
				//---Салют-7
				new Seance(datePlusOne, new Time(12,10,00), TypeD.twoD, "3"),
				new Seance(datePlusOne, new Time(14,00,00), TypeD.twoD, "3"),
				new Seance(datePlusOne, new Time(17,00,00), TypeD.twoD, "3"),
				
				
				/*Флоренция*/
				//---Бегущий по лезвию
				new Seance(datePlusOne, new Time(12,00,00), TypeD.twoD, "Малый"),
				new Seance(datePlusOne, new Time(16,40,00), TypeD.twoD, "Малый"),	
				
				//---Салют-7
				new Seance(datePlusOne, new Time(11,10,00), TypeD.twoD, "Синий"),
				new Seance(datePlusOne, new Time(14,00,00), TypeD.twoD, "Синий"),
				new Seance(datePlusOne, new Time(17,00,00), TypeD.twoD, "Синий"),
				new Seance(datePlusOne, new Time(19,00,00), TypeD.twoD, "Синий")
		);
	}
}
