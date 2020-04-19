package class25_Interface;

public interface ParentInterface {

	/*
	 * Step 1: Create Parent Interface as ParentInterface that will have undefined
	 * method parentMethod without parameters. Step 2: Create an Interface as
	 * ChildInterface that will be a child interface of Parent Interface and will
	 * have a method childMethod without parameters.
	 * 
	 * Step 3: Inherit the Main class to Child Interface. Step 4: Execute both
	 * methods
	 */

	public void parentMethod();

	public void childMethod();
}

class ChildInterface implements ParentInterface{

	
	@Override
	public void parentMethod() {
		System.out.println("Parent Method-welcome to Syntax");
	}

	@Override
	public void childMethod() {
		
		
	}
	
}
class Main{
	public static void main(String[] args) {
		
		ParentInterface prch = new ChildInterface();
		prch.parentMethod(); 
		prch.childMethod();
		
		
		
		
		
		
		
		
		
	}

	
}
