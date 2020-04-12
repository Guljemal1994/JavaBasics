package class12_StringManipulations;

public class StringManipulationMore {
 
	public static void main(String[] args) {
	//to get subString from a given String
		//SubString=String inside your string
		System.out.println("----charAt()--FUNCTION-----");
	
		String str= "Today is a rainy day";
		String partilString=str.substring(6);//start 6 from untill end od String 
	    System.out.println(partilString);
	
	    //rain day 
	    partilString=str.substring(11);
	    System.out.println(partilString);
	
	    //Today
	    partilString =str.substring(0, 5);//strats from 0 from at index 5 
	  System.out.println(partilString);
	
	  partilString = str.substring(11,16);
	  System.out.println(partilString);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
