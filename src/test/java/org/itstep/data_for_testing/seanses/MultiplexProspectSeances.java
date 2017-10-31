package org.itstep.data_for_testing.seanses;

import java.sql.Date;
import java.sql.Time;
import java.util.Arrays;
import java.util.List;

import org.itstep.dao.pojo.Seance;
import org.itstep.dao.pojo.constants.TypeD;

public class MultiplexProspectSeances {
	public static List<Seance> getList(){
		Date dateCurrent = new Date(System.currentTimeMillis());
		Date datePlusOne = Date.valueOf(dateCurrent.toLocalDate().plusDays(1)); 
		Date datePlusTwo = Date.valueOf(dateCurrent.toLocalDate().plusDays(2));
		return Arrays.asList(
				//---Бегущий по лезвию
				new Seance(dateCurrent, new Time(11,00,00), TypeD.twoD, "2"),
				new Seance(dateCurrent, new Time(16,00,00), TypeD.twoD, "2"),
				new Seance(datePlusOne, new Time(11,00,00), TypeD.twoD, "2"),
				new Seance(datePlusOne, new Time(16,40,00), TypeD.twoD, "2"),
				new Seance(datePlusTwo, new Time(10,00,00), TypeD.twoD, "2"),
				
				//---My Little Pony в кино
				new Seance(datePlusTwo, new Time(11,00,00), TypeD.threeD, "1"),
				new Seance(datePlusTwo, new Time(12,10,00), TypeD.threeD, "1"),
				new Seance(datePlusTwo, new Time(11,30,00), TypeD.twoD, "5"),
				new Seance(datePlusTwo, new Time(13,10,00), TypeD.twoD, "5"),
				
				//---Салют-7	
				new Seance(dateCurrent, new Time(11,00,00), TypeD.twoD, "4"),
				new Seance(datePlusOne, new Time(11,00,00), TypeD.twoD, "4"),
				new Seance(datePlusOne, new Time(16,40,00), TypeD.twoD, "4"),
				new Seance(datePlusTwo, new Time(11,00,00), TypeD.twoD, "4"),
				new Seance(datePlusTwo, new Time(11,00,00), TypeD.twoD, "4")
		);
		
	}
}
