package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		
		String School = "Syntax";
		String str = new String("Hello");
		//how many charcters String has
		 
		String str1="This a String 7676,&^&^";
		System.out.println(School.length());
		
		int size = str.length();
		System.out.println("String length is:"+size);
		
		//convert String to Lowers case or Upper case
		
		System.out.println(School.toLowerCase());
		System.out.println(School.toUpperCase());
		
		str=str.toLowerCase();
		
		System.out.println(str);
		
		
		//concatinate 2 String 
		System.out.println("---CONCAT FUNCTION----");
		
		String newString = str+School;
		System.out.println(newString);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
