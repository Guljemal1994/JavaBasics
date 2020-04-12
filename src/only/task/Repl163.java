package only.task;

public class Repl163 {

	final  String gul1(String s) {
		char c[] =s.toCharArray();
		 String reverse = "";
		 for(int i=c.length-1; i>=0; i--) {
			 reverse +=c[i];
		 }
		 return reverse;
	 }
	
public static void main(String[] args){
	     
	Repl163 m = new Repl163();
	    String jemka= m.gul1("hello");
	   System.out.println(jemka);  
	  }
 
}
