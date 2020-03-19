package com.syntax.class10;

public class Repl68Dollor {

	public static void main(String[] args) {
		/*
		 * For you to do: 
        Write a program to print out the pattern: 
             $$$$
            $    $
            $    $
            $$$$
		 */
		//my way
		for(int i=0; i<4; i++){
		      System.out.print("$");
		    }
		    System.out.println();
		    for(int i=0; i<2; i++){
		      System.out.print("$"+" ");
		    }
		     System.out.println();
		    for(int i=0; i<2; i++){
		      System.out.print("$"+" ");
		    } 
		    System.out.println();
		    for(int i=0; i<4; i++){
		      System.out.print("$");
		    }
		
		
		
		System.out.println("***************Teachers way********************");
		
		
		
		 for (int i=1; i<=4; i++) {
			  	for (int j=1; j<=4; j++) {
					
					if (i==1 || i==4 || j==1 || j==4) {
						System.out.print("$");
					} else {
						System.out.print(" ");
					}
				} System.out.println();
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
