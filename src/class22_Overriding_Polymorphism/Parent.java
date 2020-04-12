package class22_Overriding_Polymorphism;

public class Parent {

	private void hello() {
		System.out.println("Hello from child class");
	}
}



class Child extends Parent{
	//we are not overriding we just declare private method inside the child class
	//@Override
	private void hello() {
		System.out.println("Hello from child class");//no execute sebabi private
	}
}