package com.syntax.class11;

public class StringBrowser {

	public static void main(String[] args) {
		
		 String browser="CHROME";
	        if(browser.trim().equalsIgnoreCase("chrome")) {
	            System.out.println("Test executed on chrome browser");
	        }
	        //OR
	        
	        if(browser.toLowerCase().equals("chrome")) {
	            System.out.println("Test executed on chrome browser");
	        }
		
		
		
		
		
	}

}
