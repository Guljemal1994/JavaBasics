package com.syntax.class10;

public class TwoDimensionalAray {

	public static void main(String[] args) {
  
		int[][] numbers= new int[3][4];
		//1row

		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
		numbers[0][3]=40;
		
		//2row
		numbers[1][0]=5;
		numbers[1][1]=10;
		numbers[1][2]=15;
		numbers[1][3]=20;
		
		
		//row
		numbers[2][0]=10;
		numbers[2][1]=10;
		numbers[2][2]=10;
		numbers[2][3]=10;
		
		
		//print 15
		System.out.println(numbers[1][2]);
		
		System.out.println("---------------------------------------------");
		
		//creating 2nd array 
		int[][] nums= {//array of 3single dimensional arrays
				       {10,20,30,40},
		               {5,10,15,20},
		               {1,2,3,4}
		};
		System.out.println(nums[2][3]);//4
		System.out.println(nums[0][2]);//30
		
		System.out.println("************************************");
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			//prints array
	  
	 System.out.print(a[0][0]+" ");
	 System.out.print(a[0][1]+" ");
	 System.out.print(a[0][2]+" ");
	 System.out.print(a[0][3]+" ");
	 System.out.println();
	 System.out.print(a[1][0]+" ");
	 System.out.print(a[1][1]+" ");
	 System.out.print(a[1][2]+" ");
	 System.out.print(a[1][3]+" ");
	 System.out.println();
	 System.out.print(a[2][0]+" ");
	 System.out.print(a[2][1]+" ");
	 System.out.print(a[2][2]+" ");
	 System.out.print(a[2][3]+" ");
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
