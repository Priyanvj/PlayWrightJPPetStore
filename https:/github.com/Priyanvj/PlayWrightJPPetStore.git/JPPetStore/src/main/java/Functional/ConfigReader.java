package Functional;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties property;
	
	public Properties InitReader() throws IOException {
		FileInputStream file = new FileInputStream("./src/resources/global.properties");
		property = new Properties();
		property.load(file);
		return property;
	}

}
