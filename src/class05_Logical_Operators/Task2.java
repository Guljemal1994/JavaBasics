package class05_Logical_Operators;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		Scanner scan=new Scanner (System.in);
	    System.out.println("Enter number of day");

		int day=5;
		day=scan.nextInt();
		if (day>=1 && day<=5) {
			System.out.println("It is a weekdays");
		}else if (day>=6 && day<=7) {
			System.out.println("Is ia a weekend");
		}else {
			System.out.println("Invaild day");
		}
		
		System.out.println("----------using or-------------");
		
		if (day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("Weekdays");
		}else if (day==6) {
			System.out.println("Weekend");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
