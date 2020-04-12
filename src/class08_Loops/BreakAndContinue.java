package class08_Loops;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		//ones i=4--> we want to stop the loop
		for(int i=1; i<=10; i++) {
		if(i==4) {
		   System.out.println("I am stopping loop");
		   break;
		}
			System.out.println(i);
		}
		    System.out.println("I am outside of the loop");
		
		
		System.out.println("========CONTINUE===============");
		
	 for(int i=1; i<=10; i++) {
	 if(i==2) {
		 System.out.println("I am skipping itertion");
	      continue;
	 }
	    
	     System.out.println(i);
	 }
	 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
