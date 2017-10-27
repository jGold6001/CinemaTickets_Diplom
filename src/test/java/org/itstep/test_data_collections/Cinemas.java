package org.itstep.test_data_collections;

import java.util.Arrays;
import java.util.List;

import org.itstep.dao.pojo.Cinema;

public final class Cinemas {
	public static List<Cinema> getCinemas(){
		return Arrays.asList(
				new Cinema("Multiplex SkyMall", "ул.Ватутина 2Т"),
				new Cinema("Multiplex Проспект", "ул. Гната Хоткевича 1В"),
				new Cinema("Флоренция", "ул.Маяковского 31")
		);
	}
}
