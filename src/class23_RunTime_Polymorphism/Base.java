package class23_RunTime_Polymorphism;

public class Base {

	 public final void doSomething(Object o) {
	        System.out.println("Boolean");
	    }
	}

	class Derived extends Base {
	    public void doSomething(Integer i) {
	        System.out.println("String");
	    }
	}

	
