package com.syntax.class21;

public class MathTeacher extends Teacher{

	public MathTeacher(String name, String lastName) {
		//super(); compiler will make call implicitly if you not
		
		super(name, lastName);
		System.out.println("I am a child class constructor");
	}
}
