package only.task;

public class Repl139 {

	String dogName;
	 String dogBreed;
	 double dogW;
	  Repl139(String dogN,  String dogB,double dogWt){
	    this.dogName = dogN;
	    this.dogBreed = dogB;
	    this.dogW = dogWt;
	  }
	public void Repl139(String dogNn, String dogBb ,double dogWtt){
	   this. dogName = dogNn;
	    this.dogBreed = dogBb;
	    this.dogW = dogWtt;
	}
	 public void display(){
	    System.out.println(dogName+" "+dogW+" "+dogBreed);
	    }
	 public void display1(){
		    System.out.println(dogName+" "+dogW+" "+dogBreed);
		    }
	 public static void main(String[] args) {
		 Repl139 obj = new Repl139("Tarzan","Mutt",50.0);
		 Repl139 obj1 = new Repl139 ("Lucy", "Mutt",50.0);
		 obj.display();
		 obj1.display1();
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
