package com.syntax.class12;

public class StringManupilation {

	public static void main(String[] args) {
		
		String str = "Good Morning Students!";
		System.out.println("----charAt()--FUNCTION-----");
		char letter1=str.charAt(0);
		System.out.println(letter1);
		
		
		
		char letter2 = str.charAt(4);
		System.out.println("Letter at index 4 is"+letter2+".");
		
		//get all charcters 1 by 1 from a String 
		char letters;
		for(int i= 0; i<str.length();i++) {
			letters = str.charAt(i);
			System.out.print(" "+letters);
		}
		     System.out.println();
		System.out.println("-----indexOf()--FUNCTION------");
		
		String name = "Syntax Technologies";
		int index=name.indexOf("y");
		System.out.println(index);//1
		
		index= name.indexOf(" ");
		System.out.println(index);//6
		
		
		index = name.indexOf("Syntax");
		System.out.println(index);//0
		
		//tyr with number out of range
		
		index = name.indexOf("!");
		System.out.println("Index of not exting characters="+index);
		
		index = name.indexOf("Technologies");
		System.out.println("Index of substring Technologies="+index);
		
		
		index = name.indexOf("o");
		System.out.println("Index of first O="+index);
		
		name.lastIndexOf("o");
		System.out.println("Index of second o="+index); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
