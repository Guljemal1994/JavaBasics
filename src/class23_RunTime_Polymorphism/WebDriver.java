package class23_RunTime_Polymorphism;

public class WebDriver {

	public void open(){
		System.out.println("Opening browser");
	}
}

class FirefoxDriver extends WebDriver{
	
	public void open() {
		System.out.println("Opening FireFox browser");
	}
}

class ChromeDriver extends WebDriver{
	
	public void oper() {
		System.out.println("Opening chrome browser");
	}
}

class InternetExplorerDriver extends WebDriver{
	
	public void open() {
		System.out.println("Opening ie broser");
	}
}
