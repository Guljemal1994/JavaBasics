package com.syntax.class19;

public class Recap {

 
	Recap(){
		System.out.println("Constructor with no arguments");
	}
	
	Recap(int num){
		System.out.println("Constructor with patameter");
	}
	
	public static void main(String[] args) {
		
		Recap obj = new Recap();
		Recap obj1 = new Recap(22);
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
