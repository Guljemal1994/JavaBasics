package class05_Logical_Operators;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
		
		
		Scanner input= new Scanner (System.in);
		System.out.println("How many years have you work?");
		int workedyears=input.nextInt();
		System.out.println("How much is your salary?");
		long salary=input.nextLong();
		if (workedyears>=5) {
			System.out.println("You are elligible for the bonus");
	    if (salary>50000) {
	    	System.out.println("Your bonus is 5000");
	    }else {
	    	System.out.println("Your bonus is 3000");
	    }
		}else {
	    System.out.println("You are not eligible for the bonus");		
		}
	  }
		 
	

}

