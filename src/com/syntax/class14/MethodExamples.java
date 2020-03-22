package com.syntax.class14;

public class MethodExamples {

	// i want to create a method that will be greeding a person
	
	void greet() {
		System.out.println("Hello Sarmed");
	}
  void greet1(String name) {
	  System.out.println("Hello "+name);
  }
	
  public static void main(String[] args) {
		//how do i call method grret
	  
	  MethodExamples object1 = new  MethodExamples();
	  object1.greet1("Julia");//4 gezek copy etsen so birzady cykaryar
	  object1.greet1("Ben");
	  object1.greet1("Konul");
	  object1.greet1("Neko");
	} 

}



