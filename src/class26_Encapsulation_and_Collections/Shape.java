package class26_Encapsulation_and_Collections;

 interface Shape {//interface usually as undefined methods
      /*
	  * Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter.
	  *  Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. 
	  *  Test your code.
	  */
	void calculateArea(double x);//abstract methods
	
	void calculatePerimeter(double x);//abstract methods
}
class Circle implements Shape{

	@Override
	public void calculateArea(double x) {
	System.out.println("The area of the given circle is "+(3.14*x*x));
	}

	@Override
	public void calculatePerimeter(double x) {
		System.out.println("The perimeter of the given circle is "+(2*3.14*x));
	}
}
class Square implements Shape{

	@Override
	public void calculateArea(double x) {
    System.out.println("The area of the given Square is "+(x*x));
		
	}

	@Override
	public void calculatePerimeter(double x) {
		System.out.println("The perimeter of the given Square is "+(4*x));
	}
}

 
 


