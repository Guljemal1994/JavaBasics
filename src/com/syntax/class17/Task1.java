package com.syntax.class17;

public class Task1 {

	// Task-1
		/*Create a method that will accept an array as parameters and will return a sum
		 * of all elements from that array. Method should be visibly only within same
		 * package and accessible by the creating an instance of the class.
	 	 */
		int array(int [] x) {
			int sum=0;
			for (int i=0;i<x.length;i++) {
				sum=sum+x[i];
			}
			return sum;
		}
		public static void main(String[] args) {
			Task1 task1=new Task1();
			int[] y= {10,12,13,15};
			int arr=task1.array(y);
			System.out.println("Sum of all array element is: "+arr);

	
	
	
	
	
	
	
		}	
	
}
