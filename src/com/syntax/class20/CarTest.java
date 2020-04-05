package com.syntax.class20;

public class CarTest {
 
	public static void main(String[] args) {
		
	Car car = new Car();
		//output: I am parent class constructor
		
	System.out.println("***************************");
		
	Mercedes merc = new Mercedes();
		
	merc.display();
		
	System.out.println("-------------------------------");
    Mercedes merc1 = new Mercedes("Mersedes", "M", "No AMG");
		
	merc1.display();
		
		System.out.println("++++++++++++++++++++++++++++++");
	Mercedes merc2 = new Mercedes("Toyota", "CAmry", "No AMG");
	
	merc2.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
