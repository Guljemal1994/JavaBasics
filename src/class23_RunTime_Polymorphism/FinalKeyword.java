package class23_RunTime_Polymorphism;

public class FinalKeyword {
//public is access modifier
	
	public static String str = "Hello";
	
	 static final String str1 = "Bye";//Final variable = CONSTANT
	
	public static final String Application_URL = "http://syntaxtechs.com";
	
	 final char Grade = 'A';//variable do not have to be static it cam be only final char
	
	 public final void hello() {
		 System.out.println("I am a final method");
	 }
	 public  final void hello(String name) {
			System.out.println("Hello "+name);
		}
		
	
	class SubClass extends FinalKeyword{
		//public final void hello(){
		//}//CE:cannor override final method
	}
	public void hello(int num) {
		System.out.println("hello from child class");
	}
	
	
public static void main(String[] args) {
		
		str = "Hi";
		//str1 ="good bye"; CE: 
		//applicationURL = "http://google.com"
		
		
		
		
		
		
		
		
		
		
		
	}
}
