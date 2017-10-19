package org.itstep.test_data_collections;

import java.util.Arrays;
import java.util.List;
import org.itstep.dao.pojo.Session;

public final class Sessions {
	public List<Session> getList(){
		return Arrays.asList(
				new Session(),
				new Session(),
				new Session(),
				new Session(),
				new Session(),
				new Session()
		);
	}
}
