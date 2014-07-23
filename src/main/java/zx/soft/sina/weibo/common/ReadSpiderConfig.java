package zx.soft.sina.weibo.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReadSpiderConfig {

	private static Logger logger = LoggerFactory.getLogger(ReadSpiderConfig.class);

	private static Properties config = null;

	static {
		InputStream in = ReadSpiderConfig.class.getClassLoader().getResourceAsStream("crawl_config.properties");
		config = new Properties();
		try {
			config.load(in);
			in.close();
		} catch (IOException e) {
			logger.error("No AreaPhone.properties defined error");
		}
	}

	// 根据key读取value
	public static String getValue(String key) {
		// Properties props = new Properties();
		try {
			String value = config.getProperty(key);
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("ConfigInfoError" + e.toString());
			return null;
		}
	}

}
