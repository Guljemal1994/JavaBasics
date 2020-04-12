package class23_RunTime_Polymorphism;

public class Example {

	public void m1(){
		System.out.println("In parent class m1");
	}
	
}

class Subclass extends Example{
	
	public void m1() {
		System.out.println("In child class m1");
	}
	 void m2() {
		System.out.println("In m2");
	}
	
}

