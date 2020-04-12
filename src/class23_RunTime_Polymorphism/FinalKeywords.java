package class23_RunTime_Polymorphism;

public class FinalKeywords {

	
	final void m1(boolean value){
	    System.out.println("Final method with boolean parameter");
	  }
	   final void m1(String value){
	    System.out.println("Final method with String parameter");
	  }
	  public static void main(String[] args) {
		  FinalKeywords mm= new FinalKeywords();
	    mm.m1(false);
	    mm.m1("Syntax");
	  }
}
