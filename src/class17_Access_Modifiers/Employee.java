package class17_Access_Modifiers;

public class Employee {

	//create variable to hold:name,lastname tite,ssn
	public static String title;
	public String name;//public accessable everywhere 
	protected  String lastName;//protected accessable within same package
	private long ssn;//accessable only within same class
	double salary;//accaessable within same package 
	
	public static void method1() {
		System.out.println("I am public method"); 
	}
	
	protected void method2() {
		System.out.println("I am protected method");
	}
	
	void method3() {
		System.out.println("I am a default method");
	}
	
	private void method4() {
		System.out.println("I am a private method");
	}
	
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name= "Julia";
		emp.lastName = "Mert";
		emp.salary = 60000;
		emp.ssn = 32659914;
	// access all methods 
	    method1();
	    emp.method2();
	    emp.method3();
	    emp.method4();
	
	}
	
	
	
	
	
	
}
