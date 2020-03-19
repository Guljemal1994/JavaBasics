package com.syntax.class12;

public class Task2Sunday {

	public static void main(String[] args) {
		
		
		//Create a String and print it in reverse order (Sunday  yadnuS).
		String str = "Sunday";
		String str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		System.out.print("Reversed string is: "); 
		System.out.println(str1);
		
		
		
		
		
		
		
		
		
	}

}
