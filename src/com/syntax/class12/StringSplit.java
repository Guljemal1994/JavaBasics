package com.syntax.class12;

public class StringSplit {

	public static void main(String[] args) {
		
		
		System.out.println("----split() FUNCTION-----");
		String today="Today is my favourite Java class";
		// this function is cutting the String into two Strings
		String[]array=today.split("my"); // till my the sentence will be cut
										// as we cut it there is going to be 2 Strings.
										// So coz of that we used String[]newName
										// and my will be deleted
		System.out.println(array.length);
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println();
		System.out.println();
		String today1="Today is my favorite Java class ";
		String []stringArray=today1.split("a");
		// it will cut all the "a" from left to right
		for (String arr:stringArray) {
			System.out.print(arr+" ");
		
		}
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
