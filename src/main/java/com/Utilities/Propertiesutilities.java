package com.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertiesutilities {
	public static FileInputStream fis = null;

	public static String set_Properties(String key) {
		Properties prop = new Properties();
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");

				prop.load(fis);


			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

}
