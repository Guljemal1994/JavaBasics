package com.syntax.class19;

public class ThisKeyword {

	int a;
	int b;
	public ThisKeyword( int a, int b) {//local variable
		this.a = a;
		this.b = b;
	}
	public void Sum(int a, int b) {//instance variable 
		//sum of which variable am i calculating
		System.out.println("Sum of local variable "+(a+b));
		System.out.println("Sum of local variable "+(this.a+this.b));
	}
	
   public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword(33,55);
		obj.Sum(4, 6); //10
	
         
   
   }
	
	
}
