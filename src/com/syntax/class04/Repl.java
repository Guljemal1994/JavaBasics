package com.syntax.class04;

import java.util.Scanner;

public class Repl {

	public static void main(String[] args) {
		
 Scanner scan=new Scanner(System.in);
 System.out.println("Please enter a number");  
 int gul=scan.nextInt();
 
 if(gul%2==0) {
	 System.out.println("Value is even");
 if (gul>1000) {
	 System.out.println("Even value is large");
 }else {
	 System.out.println("Even value is just right");
 } 
	 
 }else {
	 System.out.println("Value is odd");
 }
 
 
 
 
 
 
 
 
 
 
 
 

}
}