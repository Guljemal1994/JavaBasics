package com.syntax.class14;

public class Dog {
    //define fearture of the doh
	String breed;
	String color;
	String name;
	int age;
	
	void eat() {
		System.out.println(name+" can eat");
	}
	void bark() {
		System.out.println(name+" can bark");
	}
	void run() {
		System.out.println(name+" can run");
	}
	
	public static void main(String[] args) {
		
	Dog dog1 = new Dog();//1st object
		
		dog1.breed = "Pomeranian";
		dog1.color = "Yellow";
		dog1.name = "Max";
		dog1.age = 2;
		
		dog1.bark();
		dog1.eat();
		dog1.run();
  
	Dog dog2 = new Dog();//2nd object
		
		dog2.breed = "Poodle";
		dog2.color = "Grey";
		dog2.name = "Charlie";
		dog2.age = 3;
		
		dog2.bark();
		dog2.eat(); 
		dog2.run(); 
		 
		
		
		
	}
}
