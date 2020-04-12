package class07_Loops;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		 Scanner scan=new Scanner (System.in);
		  int lnum;
		     do {
		         System.out.println("Enter any number between 1 to 20 ");
		         lnum=scan.nextInt();
		         
		     }while  ( lnum!=17);
		     System.out.println("Congratulations");

	}

}
