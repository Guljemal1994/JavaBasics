package com.syntax.class10;

public class Task01 {

	public static void main(String[] args) {

       /*
        * Create an array of animals and store 6 elements into it. 
        * Using 2 different loops print all elements from the array.
        */
		System.out.println("**********First way*********");
		String[] animals= {"Dog", "Cat", "Panda", "Koala", "Raccoon", "Horse"};
		for(int i=0; i<animals.length; i++) {
			System.out.print(animals[i]+" , ");
		}
		System.out.println();
		
		
		
		System.out.println("----Second way-----");
		
		for(String animal:animals) {
			System.out.print(animal+",");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
