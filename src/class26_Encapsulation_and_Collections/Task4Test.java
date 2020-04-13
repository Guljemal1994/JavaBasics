package class26_Encapsulation_and_Collections;

public class Task4Test {

	public static void main(String[] args) {
		
	RemoteWebDriver[] browser={new ChromeDriver(), new FireFoxDriver(), new SafariDriver()};
		 
	for(RemoteWebDriver b:browser) {
		b.open();
		b.close();
		b.getTitle();
		b.getScreenShot();
		b.navigate();
		
		System.out.println(); 
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
