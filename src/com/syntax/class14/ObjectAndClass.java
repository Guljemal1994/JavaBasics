package com.syntax.class14;


class	Accounts {// created a class called Account that doesn't have main method
			// Class is a template for creating objects. Class can contain 1) Data :
			// stages of objects such as name,age,address etc and we use instance variables(Stirng, int, boolean)to define these stages
			//2)Methods/Subroutines(we write methods in class to command the codes but it won't run if we don't invoke/call them in main method
			String name;//this is data,stages of an obj i created under main method(information about that obj)
			int age;
			void speak() {// inside of class i have methods to tell the behaviors of my objects,i can
							// write code but it won't work if i don't invoke it under main method
				System.out.println("My name is "+ name+ " and I am "+age);
			}
			void dance(){
				System.out.println("I love dancing says "+ name);
			}
		}
		public class ObjectAndClass {
			public static void main(String[] args) { 
				Accounts person1=new Accounts();//we create objects under main methods
			//name of class +name of obj=new name of class();
				person1.age=12;//name of obj.data=assign value;
				person1.name="Pablo";
				System.out.println("Name of person1: "+person1.name);
				person1.speak();// I am invoking this behavior/method inside of the Account class to run the code in the speak() method
				Accounts person2=new Accounts();
				person2.name="Sarah";
				person2.age=25;
				System.out.println("age of person2: "+ person2.age);
				person2.speak();//just invoking the code is enough with the obj name.method name();
				person2.dance();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


