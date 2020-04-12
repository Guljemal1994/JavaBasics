package class17_Access_Modifiers;

public class StaticKeyword {
	
	//create a templete for a phone
	 String color;//instence
	int memory;//instence
	
	static String brand;
	static boolean touchScreen;
	
	//return type, name , parametrs
	static void displayGeneralInfo() {
		System.out.println("We are building "+brand+" with touch screen = "+touchScreen);
	}
	//instance members of the class of the class can access All static memers 
	void displaySpecification() {
		System.out.println("We bulid phone with "+memory+" GB memory in "+color+" color");
	}
	
	//STATIC METHOD ACCES NAN_STATIC MEMMER OF THE CLASS
	//	static void displaySpecification1() {
   //   System.out.println("We bulid phone with "+memory+" GB memory in "+color+" color");
//	}
	public static void main(String[] args) {
		//accessing static variable in a static way
		brand = "iPhone";
		touchScreen = true;
		
		StaticKeyword obj = new StaticKeyword();
		//accessing instance variable through the instance of the class
		obj.color = "gray";
		obj.memory = 64;
		//accessing static method in a static way
		displayGeneralInfo();//obj.displayGeneralInfo();vail but not perferabla
		//accessing static method in non  static way
		//through instance
		obj.displaySpecification();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
