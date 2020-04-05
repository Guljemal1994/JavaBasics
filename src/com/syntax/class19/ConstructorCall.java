package com.syntax.class19;

public class ConstructorCall {

	public ConstructorCall () {
		System.out.println("I am a non argument constructor");
	}
	
	public ConstructorCall (String str) {
		this();
	}
		
	public ConstructorCall (String str, String str1) {
		this("hello");
	}
	
	public static void main(String[] args) {
		
		ConstructorCall obj =new  ConstructorCall("Java ", "Love"); 
		
	
	
	
	
	
	
	
	
	
	
	}
	
}
