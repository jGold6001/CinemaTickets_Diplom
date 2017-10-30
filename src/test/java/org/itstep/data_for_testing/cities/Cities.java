package org.itstep.data_for_testing.cities;

import java.util.Arrays;
import java.util.List;

import org.itstep.dao.pojo.City;

public final class Cities {
	public static List<City> getList(){
		return Arrays.asList(
				new City("Киев"),
				new City("Харьков")
		);		
	}
}
