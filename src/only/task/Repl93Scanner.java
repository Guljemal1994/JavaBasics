package only.task;

import java.util.Scanner;

public class Repl93Scanner {

	public static void main(String[] args) {
		
		/*
		 * You have Scanner class to input string value. 

           If language is Java it should print the: 
           "Java is a programming language".

          If language is C it should print the:
          "C is a procedural programming language"

          If language is C++ it should print the:
          "C++ is a middle-level programming language"

          If any other should print:
          "Doesn't match any programming language"

		 */
		
		//teachers way
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any programming language");
		String language = scan.nextLine();
		String message;

		switch (language.toLowerCase()) {

		case "java":
			message = "Java is a programming language";
			break;
		case "c":
			message = "C is a procedural programming language";
			break;
		case "c++":
			message = "C++ is a middle-level programming language";
			break;
		default:
			message = "Doesn't match any programming language";
		}

		System.out.println(message);
		
		
		
		
		
		Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		  String language1 = sc.nextLine(); 
		  
		  if(language1.equalsIgnoreCase("Java")){
		    System.out.println("Java is a programming language");
		  }else if(language1.equalsIgnoreCase("C")){
		    System.out.println("C is a procedural programming language");
		  }else if(language1.equalsIgnoreCase("C++")){
		     System.out.println("C++ is a middle-level programming language");
		  }else {
		     System.out.println("Doesn't match any programming language");
		  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
