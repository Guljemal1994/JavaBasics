package com.syntax.class15;

public class MethodTest {

	public static void main(String[] args) {
		
		Methods obj = new Methods();
		obj.sayWelcome();
		
		Methods obj1 = new Methods();
		obj.sayAnything("Hello",2);
		
		
		
		Methods obj2 = new Methods();
		obj.sayAnything("Julia",7);
		
		
		
		
		Methods obj3 = new Methods();
		obj.sayAnything("Hi",2);
		
		//obj.sayAnything(2,"Hi"); edip bilemzok yalnyzs
		
		obj.isItRaining(true);
		obj.isItRaining(false);
		
		
		

	}

}
