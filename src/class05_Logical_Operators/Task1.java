package class05_Logical_Operators;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("What is your heights");
		 double heights = scan.nextDouble();
		 
		if(heights>0 && heights<=60) {
			System.out.println("You are short");
		}else if(heights>=60 && heights<=70) {
			System.out.println("Your are medium");
		}else if (heights==70) {
			System.out.println(" you are tall");
		}else {
			System.out.println("Invaild heights");
		}
		
		System.out.println("------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
