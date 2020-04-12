package class17_Access_Modifiers;

public class StatickeywordTest {

	public static void main(String[] args) {
		
	//access static member of another class
	StaticKeyword.brand = "Android";
	StaticKeyword.touchScreen = true;
	StaticKeyword.displayGeneralInfo();
	
	
	//access static member of another class
	
	StaticKeyword obj = new StaticKeyword();
	
	obj.color = "Red";
	obj.memory = 128;
	obj.displaySpecification();
	
StaticKeyword obj1 = new StaticKeyword();
	
	obj1.color = "Red";
	obj1.memory = 128;
	
	
StaticKeyword obj2 = new StaticKeyword();
	
	obj2.color = "Red";
	obj2.memory = 128;
	obj2.brand = "Nokia";//brand wiil change for all instance
	
	//this is not a right way access sattic method
	obj2.displaySpecification();
     obj1.displaySpecification();
	obj.displaySpecification();
	
	
	
	
	
	
	}	
	
}
