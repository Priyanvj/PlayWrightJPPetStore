package Functional;

import java.io.IOException;
import java.util.Properties;

public class WebActions {
	
	public static String getProperty(String Key) throws IOException {
		ConfigReader config = new ConfigReader();
		Properties property = config.InitReader();
		return property.getProperty(Key);
	}

}
