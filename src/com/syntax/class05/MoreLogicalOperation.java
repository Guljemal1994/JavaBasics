package com.syntax.class05;

import java.util.Scanner;

public class MoreLogicalOperation {

	public static void main(String[] args) {
		
		/*We have total 7 day in a week
		 * if day is 2 ,3--> SDLC Class
		 * if day 1,5 we are off day 
		 * if day 4 --> review class
		 */
		int day=6;
		day=7;
	 
	if (day==2 ||day==3) {
		 System.out.println("Today is SDLC Class");
	 }else if(day==6 || day==7) {
		 System.out.println("Today is Java class");
	 }else if (day==1 || day==5) {
		 System.out.println("Today is off day");
	 }else if(day==4){
		System.out.println("Today is reviw day"); 
	 }else {
		 System.out.println("Day invaild");
	 }
		
		
		System.out.println("-----using sting-----");
		
		//to compare String we use equals
		String day1="Saturday";
		if(day1.equals("Tuesday") || day1.equals("Wednesda")){
			System.out.println("Today is SDLC Class");
		}else if(day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("We have java class"); 
		}else if (day1.equals("Monday") || day1.equals("Friday")) {
			System.out.println("No class");
		}else {
			System.out.println("Indaild class");
		}

//	Write a program for user to enter his/hers birth month. Based on the month define the season.
//		Example: if user is born in June, July or August  season =“Summer”.
//		At the end of the program we should see output as “You were born ______“.

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Witch month were you born");
		String month=scan.nextLine();
		String season = null;
		
		if (month.equals("December") || month.equals("January") ||month.equals("February")){
			season="Winter";
		}else if (month.equals("March") || month.equals("April") ||month.equals("May") ) {
			season="Spring";
		}else if (month.equals("June") || month.equals("July") ||month.equals("August")) {
			season="Summer";
		}else if (month.equals("September") || month.equals("October") ||month.equals("November")) {
			season="Fall";
		}
		System.out.println("You were born " +season);
		
		
		
		
		
		
		
		
		
	}

}
