package class18_Constructor_ThisKeyword;

public class ConstructorIntro {

//	ConstructorIntro(){
//		
//	}CE: will create one default consctuctor for me
	
	//to create a constructor:
	//1. name must be ame as class name 
	//2. no return type (note even void and return )
	
	ConstructorIntro(){
		System.out.println(" I am a constructor");
	}
	
	
	
	
     public static void main(String[] args) {
		
    	 ConstructorIntro obj = new ConstructorIntro();
    	 System.out.println("Code after constructor");
    	 
    	 
	}
	
	
	
	
	
	
}
