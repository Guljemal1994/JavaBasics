package com.syntax.class14;

public class Car {//but i need this class first
//we do not need main method only for this page
	//define feature of the car
	//varible koplen field diyibem cykya
	String make;//String type of variable I can put numbers
	//san goyjak bolsanam "" icinde goymaly
	String model;
	int year;//san bolsa int ulanyas
	String color;
	int speed;//san bolany un int ulanyas
	
	     //note
	//Class - is a template
	//object - instance/examle of the class
	
	//define behavior
	void drive() {//must use {} 
		
		System.out.println("Car can drive ");
	}
	
	void accelerate() {//open parentizis 
		
		System.out.println("Car can accelerate ");
	}//close parentizis
	
	void makeNoise() {
		System.out.println("Car make noise");
	}
	void stop() {//hersine ayry ayry acmaly
		System.out.println("Car stops when you press break");//nace sany syso ulanayyn diysen ulanyp bolyar
		System.out.println("Car stops ");//yone birin icinde
	}//hersine ayry ayry yapmaly
	
	
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
			//accssing behavior /methods of Car with car2
				car2.drive();
				car2.accelerate();
				car2.stop();
				car2.makeNoise();
				System.out.println();
			//Lamborghini
				System.out.println(car1.make);
	//accssing behavior /methods of Car with car1
				car1.drive();
				car1.accelerate();
				car1.stop();
				car1.makeNoise();
				
				//I drive Pink BMW
				System.out.println("I drive "+car2.color+" "+car2.make);
	
	// iki class acybam edip bolyar 
	        //bir class gornusem su //iki sahypa gornusem Garage bn bile 
	
	//create object
				//new Bike --> we connot create an object if we do not have  a class 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
