package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		/*
		 * Ask a user to pay a candy 
		 * As long as entered price is not 2 
		 * we need keep asking to pay
		 * one amount id correct-->"Enjay your Candy
		 */
		
		Scanner scan;
		double price;
		do {
		scan=new Scanner(System.in);
		System.out.println("Please pay for candy");
		price=scan.nextDouble();
		}while(price !=2);
	
	System.out.println("Enjoy your candy");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
