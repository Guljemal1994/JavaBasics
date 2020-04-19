package class25_Interface;

public interface FirstInterface {

//**Follow Steps Carefully.
//Step1: Create Interface as FirstInterface and create undefined method as firstMethod (without parameter)
//Step 2: Create another interface as SecondInterface in which create a method as secondMethod (Without Parameter)

	//Step 3: Inherit both interfaces to Main class. 
	//Step 4: Execute both methods

	
	public void firstMethod();
	public void secondMethod();
	
}
class SecondInterface implements FirstInterface{

	@Override
	public void firstMethod() {
		System.out.println("First Method implementing multiple Inheritance");
		
	}

	@Override
	public void secondMethod() {
		System.out.println("Second Method implementing multiple Inheritance");
		
	}
	
}
