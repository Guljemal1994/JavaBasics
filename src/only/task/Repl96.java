package only.task;

import java.util.Scanner;

public class Repl96 {

	public static void main(String[] args) {
		//Write a for loop that will print out the reverse of the string.
		
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
		    //write your code below
		
		    String reverse = "";
	        
	        
	        for(int i = s.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + s.charAt(i);
	        }
	        
	       
	        System.out.println(reverse);
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
}