package class31_Filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		//write into exsiting file and add values
		String filessPath = "C:\\Users\\konul\\eclipse-workspace\\JavaBasics\\configs\\Example.properties";
		FileInputStream file = new FileInputStream(filessPath);
		
		Properties prop = new Properties();//obj
		prop.load(file);
		
		prop.setProperty("phoneNumber", "12365478");
		prop.setProperty("month", "April");
		prop.setProperty("Brithday", "22.09.94");
		
		FileOutputStream fos = new FileOutputStream(filessPath);
		prop.store(fos, "added additonal key");
		
		

	}

}
