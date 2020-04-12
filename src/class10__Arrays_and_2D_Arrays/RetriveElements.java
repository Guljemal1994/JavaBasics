package class10__Arrays_and_2D_Arrays;

public class RetriveElements {

	public static void main(String[] args) {


		char[] grades = {'A','B', 'C', 'D', 'E', 'F'};
		// getting all elements
		
		for(int i=0; i<grades.length; i++) {
			System.out.print(grades[i]+" ");
		}
		
		System.out.println();//i used for sapreate line
		System.out.println("----printing using advence gor loop-------");
		// advence starts with for
		for(char garde:grades) {
			System.out.print(garde+" ");
		}
		
	
		System.out.println();
		System.out.println(":::::::::::::::::::::");
		
		
		
		
		int[] num = {45, 78, 12,  67, 55, 89, 23, 77, 88};
	     for(int i=0; i < num.length; i++) {
	    	 System.out.print(num[i]+" ");
	     }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
