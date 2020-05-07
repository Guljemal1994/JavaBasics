package class31_Filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class WebDriverTasnk {

public static void main(String[] args) throws IOException {

  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

  String path = "configs\\Task.Properties";
  FileInputStream fis = new FileInputStream(path);
  Properties pro = new Properties();
  pro.load(fis);
  
  String b = pro.getProperty("browser");
  if(b.equals("Chrome")) {
	  WebDriverTasnk dr = new WebDriverTasnk();
  }
  
  
  
	}
}
