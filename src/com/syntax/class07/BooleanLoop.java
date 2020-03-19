package com.syntax.class07;

public class BooleanLoop {

	public static void main(String[] args) {
		
		boolean rain=true;
		
		if (rain) {
			System.out.println("Tkae umbrella");//1 time
		}
		while (rain) {
		System.out.println("Take umbrella");//infinite
		
		}
		
		while (rain) {
			System.out.println("Take umbrella");//1 time
			rain=false;
			}
		
		
		
		
	}

}
