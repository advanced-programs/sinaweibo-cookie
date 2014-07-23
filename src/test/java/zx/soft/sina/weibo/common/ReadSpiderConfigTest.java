package zx.soft.sina.weibo.common;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ReadSpiderConfigTest {

	@Test
	public void testGetValue() {
		assertNull(ReadSpiderConfig.getValue("datasource.url"));
		assertNotNull(ReadSpiderConfig.getValue("max_connections"));
	}

}
