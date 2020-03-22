package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		//we neeed main method
		//build individual objects
		//i can print as many object as i want  but 
	Car car1 = new Car();//objects
		
		car1.make = "Lamborghini";
		car1.model ="Gallardo";
		car1.year = 2020;
		car1.color = "Blue";
		
	Car car2 = new Car();
		
		car2.make = "BMW";
		car2.model ="m5";
		car2.year = 2019;
		car2.color = "Pink";
		
	Car car3 = new Car();
		
		car3.make = "123";
		car3.speed=200;
	
		//print BMW
		System.out.println(car2.make);
		//Lamborghini
		System.out.println(car1.make);
		
		//I drive Pink BMW
		System.out.println("I drive "+car2.color+" "+car2.make);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
