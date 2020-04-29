package class23_RunTime_Polymorphism;

public class WebbbDriverssssssss {

	public void open(){
		System.out.println("Opening browser");
	}
}

class FirefoxDriver extends WebbbDriverssssssss{
	
	public void open() {
		System.out.println("Opening FireFox browser");
	}
}

class ChromeDriver extends WebbbDriverssssssss{
	
	public void oper() {
		System.out.println("Opening chrome browser");
	}
}

class InternetExplorerDriver extends WebbbDriverssssssss{
	
	public void open() {
		System.out.println("Opening ie broser");
	}
}
