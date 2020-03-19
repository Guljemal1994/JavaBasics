package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		
		//find largest element from an array
		int[] nums={200,30,-1,900,56,787};
		
		int largest=0; 
		for(int g:nums) {
			if (g>largest) {
				largest=g;
			}
		}
		System.out.println("The largest number "+largest);
		
		
		System.out.println("------2nd way------");
		System.out.println();
		int num, size;
		int []array= {200,30,-1,900,56,787};
		 size = array.length;
	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               num = array[i];
	               array[i] = array[j];
	               array[j] = num;
	            }
	         }
	      }
	      System.out.println("largest element is:: "+array[size-1]);
		
		
		
		
		System.out.println("-----------3rd way--------");
		System.out.println();
		
		int[] num1= {200,30,-1,900,56,787};
		int maxNumber=num1[0];
		for (int i=0; i<num1.length; i++) {
			if (num1[i]>maxNumber) {
			maxNumber=num1[i];
			System.out.println(num1[i]);
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}
