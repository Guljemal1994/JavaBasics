package class31_Filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileReading {

	public static void main(String[] args) throws IOException {
		
		//to read the file
		//Step  1. have file
		String filePath = "C:\\Users\\konul\\eclipse-workspace\\JavaBasics\\configs\\Example.properties";
		
		//Step 2. bring object of FileInputStream
		
		FileInputStream fileInput = new FileInputStream(filePath);
		
		//to handle data from .properties file we need Properties Class
		
		Properties prop= new Properties();
		prop.load(fileInput);
		String name = prop.getProperty("name");//name is key
		System.out.println(name);
		String lastName = prop.getProperty("lastName");
		System.out.println(lastName);
		String city = prop.getProperty("city");
		System.out.println(city);
		
		System.out.println("----Getting all keys from property file----");
		Set<Object> keys = prop.keySet();
		for(Object k:keys) {
			System.out.println(k);
		}
	}

}
