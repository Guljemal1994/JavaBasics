package com.syntax.class19;

public class ClassesTest {

	public static void main(String[] args) {
		
		ClassB classb = new ClassB();
		classb.name = "Gonul";
		classb.lasName = "Kuly";
		classb.age = 5;
		classb.futureJob = "Doctor";
		classb.excersice = "Gymnastics";
		classb.workout = "Yoga";
		classb.see();
		classb.looseWeght();//access method from own class

		System.out.println("*******************************");
		ClassC classc = new ClassC();
		classc.name = "Gonul";
		classc.hair = "Curly";
		classc.eyeColor = "brown";
		classc.faceShape = "Ovel";
		
		classc.beautiful();//access method from ClassC class
		
		
		

	}

}
