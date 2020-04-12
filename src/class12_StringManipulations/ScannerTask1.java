package class12_StringManipulations;

import java.util.Scanner;

public class ScannerTask1 {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Mom's firs name:");
		String momName = scan.nextLine();
		
		System.out.println("Dad's first name");
		String dadName = scan.nextLine();
		
		System.out.println("Boy or Girl?");
		String baby = scan.nextLine();
		String babyName=null;
		int h1= momName.length()/3;
		int h2= dadName.length()/2;
		
		if(baby.equalsIgnoreCase("Girl")) {
			babyName = momName.substring(0,h1)+dadName.substring(h2);
			System.out.println(babyName);
		}else {if(baby.equalsIgnoreCase("boy"))
			babyName = dadName.substring(0,h1) +momName.substring(h2);
			System.out.println(babyName);
		}
		
		

		
		

		
		
		
		
		
		
		
	}

}
