package com.syntax.class08;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sumEven=0;//10
	    int sumOdd=0;
	    
	    System.out.println("What is starting Point");
	    int point=scan.nextInt();
	    int point1=scan.nextInt();
	
	for (int i=point; i<=point1; i++) {
		if (i%2==1) {
			sumOdd=i+sumOdd;
		}else {
			sumEven=sumEven+i;
		}
	}
	System.out.println("The total of numbers between "+point + " to "+ point1+" is "+sumOdd);
	System.out.println("The total of numbers between "+point + " to "+ point1+" is "+sumEven);
	
	}

}
