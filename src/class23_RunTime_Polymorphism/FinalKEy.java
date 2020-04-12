package class23_RunTime_Polymorphism;

public class FinalKEy {

	
	 public final String reverseString(String toReverse){
		    
		    String reverseString="";
		    for(int i=toReverse.length()-1;i>=0;i--){
		      reverseString=reverseString+toReverse.charAt(i);
		    }
		    
		    return reverseString;
	  }
	 
	 
	 
	 
	 public static void main(String[] args){
		    
			FinalKEy mm=new FinalKEy();
		    String newString=mm.reverseString("hello");
		    System.out.println(newString);
		  }
		  
	
}
