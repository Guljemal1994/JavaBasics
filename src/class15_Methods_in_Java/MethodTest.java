package class15_Methods_in_Java;

public class MethodTest {

	public static void main(String[] args) {
		
		Methods obj=new Methods();
		obj.sayWelcome();
		obj.sayAnything("Hello", 2);
		obj.sayAnything("Bye", 20);
		//obj.sayAnything(10, "Hi");CE
		
		obj.isItRaining(true);
		obj.isItRaining(false);
		
		obj.evenOrOdd(23);
		obj.isLarger(12, 13);
		obj.isPalindrome("Madam");
		obj.sayHello("RUSSIA");
		
	}
}