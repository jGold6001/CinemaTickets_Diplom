package org.itstep.data_for_testing.cinemas;

import java.util.Arrays;
import java.util.List;

import org.itstep.dao.pojo.Cinema;

public final class Cinemas {
	public static List<Cinema> getList(){
		return Arrays.asList(
				new Cinema("Multiplex SkyMall", "ул.Ватутина 2Т"),
				new Cinema("Multiplex Проспект", "ул. Гната Хоткевича 1В"),
				new Cinema("Multiplex Dafi", "ул. Героев Труда 9"),
				new Cinema("Флоренция", "ул.Маяковского 31")
		);
	}
}
