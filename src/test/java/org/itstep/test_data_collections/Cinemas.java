package org.itstep.test_data_collections;

import java.util.Arrays;
import java.util.List;

import org.itstep.dao.pojo.Cinema;

public final class Cinemas {
	public static List<Cinema> getCinemas(){
		return Arrays.asList(
				new Cinema("Multiplex", "ул.Ватутина 2Т, 'Sky Mall'")
		);
	}
}
