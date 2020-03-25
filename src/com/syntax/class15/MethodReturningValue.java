package com.syntax.class15;

public class MethodReturningValue {

	public static void main(String[] args) {
		
		MethodReturningValue newObject = new MethodReturningValue();
		int num = newObject.largest(12, 13);
		boolean flag = newObject.isOdd(num);
		System.out.println("Largest number " + num + " is odd number:" + flag);

	}
	// create a method that returns largest number from 2 given numbers
	int largest(int a, int b) {
		int largest;
		
		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}
		return largest;
	}

	boolean isOdd(int num) {

		boolean isOdd;

		if (num % 2 == 0) {
			isOdd = false;
		} else {
			isOdd = true;
		}

		return isOdd;
		
		
		
		
		
		
		
		
		
		

	}

}
