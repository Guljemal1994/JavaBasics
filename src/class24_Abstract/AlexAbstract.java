package class24_Abstract;


abstract class Dog{
	
	public void bark() {
		System.out.println("Bark!");
	}
	public abstract void name();//abstract classes helps us to organize what dog should have
		
}

class Cat extends Dog{
	
	public void name() {
		System.out.println("Lucy");
	}
}

public class AlexAbstract {

 public static void main(String[] args) {
 
	 Cat cc = new Cat();
	 cc.bark();
	 cc.name();
	 
 
 
 
 
 
 
 } 
 }
