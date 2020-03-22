package com.syntax.class10;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
	
		int[][][] ddd = { { { 3, 90, 7, 430 },
			                { 56, 78, 2 } }, 
			           	  { { 8, 5, 12, 545 }, 
				            { 40, 67 }, 
			            	{ 80, 54, 345 } } };
       
		int max = 0;
        int secondmax=0;
        for (int[][] x : ddd) {
            for (int[] y : x) {
                for (int z : y) {
                    if (z > max) {
                     secondmax=max;
                        max = z;
                    }else if(z>secondmax) {
                        secondmax=z;
                    }
                }
            }
        }
        System.out.println(max);
        System.out.println(secondmax);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
