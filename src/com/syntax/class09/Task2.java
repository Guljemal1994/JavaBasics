package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
	//print the following oatterin 
		/*
		 * 5
		 * 44
		 * 333
		 * 2222
		 * 11111
		 */
		System.out.println("First");
		
		for(int r=5; r>=1; r--) {
			for( int c=5; c>=r; c--) {
				System.out.print(r+" ");
			}
	          System.out.println();
		}
		
		System.out.println("Second");
		 //print the following pattern
	/* 
        * * 
        * * * 
         * * * * 
         * * * * * 
         * * * * 
         * * * 
         * * 
          * 
      */
		for(int z=1; z<=5; z++) {
			for(int d=1; d<=z; d++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for(int d=4;d>=1;d--) {
			for(int z=1;z<=d;z++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
