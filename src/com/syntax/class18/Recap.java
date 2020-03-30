package com.syntax.class18;

public class Recap {

	protected int sumFromArray(int [] array) {//array is local veriables
		
		int total =0;
		for(int i=0; i<array.length; i++) {
			total += total+array[i];
	}
		return total;
	}
	
	public static void main(String[] args) {
		Recap obj = new Recap();
		int[] array = {2,4,8,6,99};
		System.out.println("total = "+obj.sumFromArray(array));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
