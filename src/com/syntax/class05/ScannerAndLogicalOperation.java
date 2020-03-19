package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperation {

	public static void main(String[] args) {
		/*Take age input from userand then based age print output
		 * if age from 0-3--> you are baby
		 * if age from 4-5--> you are kid
		 *  if age from 6-12-->you are child
		 *  if age from 13-19--you are teenager
		 *  if you from 20-64--->you are adult
		 *  if age is more or equal to 65---> emjoy your life
		 */
	
	     //1-let's declare all vareable
		int age;
		Scanner scan;
		
		//2. caprue values
		 scan=new Scanner(System.in);
	      System.out.println("PLease enter yor age");
		 age =scan.nextInt();
		
		
		//3perform verfication
		if(age>=0 && age<3) {
			System.out.println("You are baby");
		}else if (age>=3 && age<=5) {
			System.out.println("You are kid");
		}else if (age>=6 && age<=12) {
			System.out.println("you are child");
		}else if (age>=13 && age<=19) {
			System.out.println("you are teenager");
		}else if(age>=20 && age<64) {
			System.out.println("you are adult");
		}else  {
			System.out.println("Enjiy your life");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}

}
