package class24_Abstract;

public abstract class Parent1 {

	public void m1(){
	    System.out.println("Parent class providing implementation");
	  }
	public abstract void m2();
}  
class Child1 extends Parent1{
	  

	@Override
	public void m2() {
		 System.out.println("Child class providing implementation");
		
	}
}
