package only.task;

public class Repl138 {

	String label;
	  double price;
	  String category;
	  boolean hasX;
	  int stock;
	  
	  Repl138(String l, double p, String pr, boolean h1, int s){
	    label = l;
	    price = p;
	    category = pr;
	    hasX = h1;
	    stock = s;
	  }
	  public void Repl138(String l, double p, String pr, boolean h, int s){
	    label = l;
	    price = p;
	    category = pr;
	    hasX =h;
	    stock = s;
	  }
	  public void Repl1381(String l, double p, String pr, boolean h2, int s){
	    label = l;
	    price = p;
	    category = pr;
	    hasX = h2; 
	    stock = s;
	  }
	  
	  void display1(){
	    System.out.println(label+" "+price+" "+category+" "+hasX+" "+stock);
	  }
	  
//	  void display2(){
//	    System.out.println(label+" "+price+" "+category+" "+hasX+" "+stock);
//	  }
//	  void display3(){
//	    System.out.println(label+" "+price+" "+category+" "+hasX+" "+stock);
//	  }
	  
	  public static void main(String[] args)	{
			
		  Repl138 obj1 = new Repl138("Eggs", 3.0 ,"Produce", true,10 );
			
			Repl138 obj2 = new Repl138("Paper Towels", 2.0 ,"misc", false,24);
			
			Repl138 obj3 = new Repl138("Paper Towels", 2.0 , "null", false,10 );
			
			obj1.display1();
			obj2.display1();
			obj3.display1();
			}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}

