package com.syntax.class19;

public class Test {

	public static void main(String[] args) {
		//variable
		Dog dog = new Dog();//constructor
		//access variables from own(Shild class)
		dog.breed = "Husky";
		//access variables from parent class
		dog.color = "Red";
		dog.fur = "Too much";
		dog.size = "Big";
		//access variables from own(Shild class)
		dog.bark();
		//access variables from parent class
		dog.beWild();
		dog.eat();
		dog.sleep();
		dog.age = 3;
		dog.display();
		System.out.println("++++++++++++++++++++++++++++++++");
		
		Animals animal =  new Animals();
		//can access any 
		//features define wthin it is class
		animal.color = "Black";
		animal.size = "Any";
		animal.fur = "Any";
		
		animal.sleep();
		animal.eat();
		animal.beWild();
		
		
		
		
		
		
		
		
	}
}
