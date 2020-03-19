package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		
		
		int[] grades=new int[4];
		grades[0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=9078;
		//what is the avarage
		int avarage=(grades[0]+grades[1]+grades[2]+grades[3]);
		
		System.out.println("Avarage grade is "+avarage);
		//------------------------------------------------------------------
		
	       System.out.println("--------------Creating cities an array-----------------");
		String[] cities= {"Washington DC","New york", "Paris", "Maiami", "Los Angels","Dallas","Chantily"};
		//Live in paris
		System.out.println("I live in "+cities[2]);
		
		int x=1; 
		System.out.println(cities[x]);
		x+=3;
		System.out.println("I moved to "+cities[x]);
		
		//how many elements stored an array?
		int arraySize=cities.length;
		System.out.println("Total elements "+arraySize);
		
		// how canwe access las element from an array
		System.out.println(cities[arraySize-1]);
		
		
		//access all elements from an array
		for(int i=0; i<arraySize; i++) {
			System.out.println(cities[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
