package class21_SuperKeyword_Overloading;


public class Parent {
	void m1() {
		System.out.println("m1 is a parent class");
	}
	
}

class Child extends Parent{
	
	 void m() {
		
		System.out.println("m1 is a child class");
		
	}
	void m2() {
		m();
		super.m1();
		
	}
}


