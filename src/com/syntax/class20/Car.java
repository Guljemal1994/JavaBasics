package com.syntax.class20;

public class Car {
//access motifier public 
	
	String make, model;
	
	public Car(){//constructor 
		System.out.println("I am parent class constructor");
	}
	public Car(String make, String model) {
		this.make = make;
		this.model  = model;
	}
}
	class Mercedes extends Car {//parent class
		
		String sportModel;
		
	public	Mercedes() {//child class
			//super()://compiler add super() by default
		System.out.println("I am child class constructor");
		}
	
	public Mercedes(String make, String model, String sportModel) {
		super(make, model);
		this.sportModel = sportModel;
	}
	
	public void display() {
		System.out.println("I have "+make+" "+model+" "+sportModel);
	}
	
	}
	
	
	
	
	

