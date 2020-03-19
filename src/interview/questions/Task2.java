package interview.questions;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		
		 Scanner scan=new Scanner(System.in);
	     int num;
	      System.out.println("Please enter a number?");
	      num=scan.nextInt();
	      int i=2;
	      while(i<num) {
	      if(num%i==0) {
	   	  System.out.println("The number "+num+" is not a prime number");
		  break;
	   }  i++;
	    }if(num==i) {
		  System.out.println("The number "+num+" is a prime number");
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
