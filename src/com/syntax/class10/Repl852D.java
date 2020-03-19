package com.syntax.class10;

public class Repl852D {

	public static void main(String[] args) {
           //MY way
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		
		    int n = 5;
		for(int i=0; i<a.length; i++){
			for(int p = 0; p<a[i].length; p++) {
			 n = n + a[i][p];
			}
		}
		
		System.out.println(n);
		
		
         System.out.println("-----Teachers way------------");
		
     	int sum = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					sum = sum + a[i][j];
				}
			}

		}
		System.out.println(sum);
		
		
		
		
		
		
	}

}
