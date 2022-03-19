package initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileInitializer {

	public static Properties property;
	public static void initialize() throws IOException {
	File file= new File("C:\\Selenium wprkspace\\BDDCucumberWithPageObject\\src\\test\\resources\\locators\\locator.properties");
	FileInputStream fis = new FileInputStream(file);
	property = new Properties();
	property.load(fis);
	}
}
