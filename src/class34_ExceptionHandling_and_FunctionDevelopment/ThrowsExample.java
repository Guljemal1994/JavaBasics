package class34_ExceptionHandling_and_FunctionDevelopment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	
	public static void multpleSleep() {
		try {
			sleep();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
	public static void read(String filePath) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(filePath);
	}

	
	
	
	public static void main(String[] args)  {
		
		
		multpleSleep();
		try {
			read("");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("---Program enn-----");
		
		
		
	}
}
