package com.syntax.class07;

public class Tas2 {
public static void main(String[] args) {
	
	//how to print odd numbers
	int num=1;
	while(num<20) {
		System.out.println(num);
		num+=2;
	}
	
	//2way using mod ad if contition 
	System.out.println("*************************");
	int num4=1;
	while(num4<=20) {
		if(num%2 !=0) {
			System.out.println(num4);
			 num4++;
		}
		
	}
	
	
	System.out.println("----------------------");
	//3 way
	int y=1;
	while(y<=20) {
		System.out.println(y++);
	     y++;
	     
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
