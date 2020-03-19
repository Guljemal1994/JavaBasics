package only.task;

import java.util.Scanner;

public class Repl94Scanner {

	public static void main(String[] args) {
		
		  /*
		   * If browser is ChRoME it should print the: 
             "Proceed with Chrome browser"

             If browser is FireFOX it should print the: 
             "Proceed with Firefox browser"

             If browser is IE it should print the:
             "Proceed with IE browser"

             If any other browser it should print the:  
             "Invalid browser"

		   */
		
		//my
		 Scanner sc = new Scanner(System.in); 
		    System.out.println("Enter the browser name to proceed further with execution");
		    String browser = sc.nextLine(); 
		 
		 if(browser.equalsIgnoreCase("ChRoME")){
		   System.out.println("Proceed with Chrome broser");
		}else if(browser.equalsIgnoreCase("FireFOX")){
		  System.out.println("Proceed with Firefox browser");
		}else if(browser.equalsIgnoreCase("IE")){
		  System.out.println("Proceed with IE browser");
		}else{
		  System.out.println("Invalid browser");
		}
		  
		
		//Teachers way
		 Scanner scan = new Scanner(System.in);
			System.out.println("Enter the browser name to proceed further with execution");
			String browser1 = scan.nextLine();
			
			if (browser1.equalsIgnoreCase("Chrome")) {
				System.out.println("Proceed with Chrome browser");
			} else if (browser1.equalsIgnoreCase("Firefox")) {
				System.out.println("Proceed with Firefox browser");
			} else if (browser1.equalsIgnoreCase("Ie")) {
				System.out.println("Proceed with IE browser");
			} else {
				System.out.println("Invalid browser");
			}
		
		
		
		
		
		
		
		
		
		
	}
	}


