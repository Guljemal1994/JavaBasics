package com.syntax.class14;

public class EvenOrOddExample {

	public static void main(String[] args) {
		
		
		int start = -3;
		int end = 6;

		for (int val = start; val < end; val++)
		{
		    // Condition to Check Even, Not condition (!) will give Odd number
		    if (val % 2 == 0) 
		    {
		        System.out.println("Even" + val);
		    }
		    else
		    {
		        System.out.println("Odd" + val);
		    }
		}

	}

}
