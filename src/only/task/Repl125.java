package only.task;

public class Repl125 {

	static String mixString(String s1, String s2){//method body start
		  String mix ="";
		  for(int i=0; i<s1.length(); i++){
		    mix= mix +s1.charAt(i)+s2.charAt(i);
		 //end
		 }
		  return mix;
		}
		
			//test case below (dont change):
		public static void main(String[] args){
		  String fristValue = mixString("12345","abcde"); 
			System.out.println(fristValue); 
			String secondValue = mixString("howdy","hello");
			System.out.println(secondValue); 
			
	
	 
	 
	 
	  
		 
		
		
		}	
		}			

