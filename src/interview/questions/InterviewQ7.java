package interview.questions;

import java.util.Arrays;

public class InterviewQ7 {

	public static void main(String[] args) {
	
		
		int [] numbers= {34,23,64,76,8,2};
		// 1st way
		Arrays.sort(numbers);
		System.out.println("Smallest "+numbers[0]);
		System.out.println("Biggest "+numbers[numbers.length-1]);
		System.out.println("Second Largest " +numbers[numbers.length-2]);
		System.out.println();
		
		
		
		//2nd way//herhili san goyup barlap gor uly kici sanlary
		int [] numbers2= {-1 ,32,90, 61,16,89,89,74,25,110};//2 sany duplicate number bar 89
		int smallest=numbers2[0];
		int largest= numbers2[0];;
		int largest2= 0;//beylede ulanyp bilyan
		for (int i=0; i<numbers2.length; i++) { // you can start with i=1 as we declared index 0 smallest...
			int element=numbers2[i];
			if (element>largest) {
				largest2=largest;
				largest=element;
			}else if (element>largest2 && element!= largest) { // check if it is bigger than second largest
				largest2=element;
			}else if  (element<smallest) {
				smallest=element;
		}
	}
		System.out.println("smallest = "+smallest);
		System.out.println("largest = "+largest);
		System.out.println("second largest = "+largest2);
		  
		  
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
