package class18_Constructor_ThisKeyword;

public class ConstructorsDemo {

	static String str = "Hello";
	
	ConstructorsDemo(){
		System.out.println("I am your constructor");
		System.out.println("I am non agrument constructor ");
	}
	
	
	ConstructorsDemo(String str){
		System.out.println("I am a constructor with 1 String parameter "+str);
	}
	
	ConstructorsDemo(int num){
		System.out.println("I am a constructo with 1 int value = "+num);
	}
	
	ConstructorsDemo(String str, int num1){
		System.out.println("I am a constructo with 2 parametrs : "+str+" & "+num1);
	}
	
	void ConstructorsDemo() {
		System.out.println("who am I");
	}
	
	
	
	public static void main(String[] args) {
		
		//ConstructorsDemo obj = new ConstructorsDemo ();
		System.out.println(str);
		ConstructorsDemo obj = new ConstructorsDemo();
		ConstructorsDemo obj1 = new ConstructorsDemo("Java class");
		ConstructorsDemo obj2 = new ConstructorsDemo(8885);
		ConstructorsDemo obj3 = new ConstructorsDemo("Yes",13);
		ConstructorsDemo obj4 = new ConstructorsDemo();
		obj4.ConstructorsDemo();//who am I 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
