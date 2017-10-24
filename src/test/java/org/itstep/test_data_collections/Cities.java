package org.itstep.test_data_collections;

import java.util.Arrays;
import java.util.List;

import org.itstep.dao.pojo.City;

public final class Cities {
	public static List<City> getCities(){
		return Arrays.asList(
				new City("Киев")
		);		
	}
}
