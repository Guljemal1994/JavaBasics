package class12_StringManipulations;

public class MoreStringFunctions {

	public static void main(String[] args) {
		
		String me = " I am a good tester";
		System.out.println("---replace()---FUNCTION---");
		String newString = me.replace("a", "c");
		System.out.println(newString);
		
		//if it finds matching char sequence--> then replace
	     me=me.replace("good", "amazing");
		
		System.out.println(me);
		
		//if it is not finding matching sequence -->nor replace
	     me=me.replace("great", "amazing");
		System.out.println(me);
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
