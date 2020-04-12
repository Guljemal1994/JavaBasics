package class19_ThisKeyword_Inheritance;

public class USA1 {

String state, stateCapital;
	
	public USA1(String state, String stateCapital) {
		
		this.state=state;
		this.stateCapital=stateCapital;
	}
	
	public void displayState() {
		System.out.println(state);
	}
	
	public void displayStateCapital() {
		System.out.println(stateCapital);
	}
	
	//can I call a method inside another method? --> YES
	public void displayInfo() {
		//this.displayState();
		displayState();//by default compiler add this keyword to a method
		displayStateCapital();
	}
	
	public static void main(String[] args) {
		USA1 state1=new USA1("Texas", "Austin");
		state1.displayInfo();
		
		state1=new USA1("Georgia", "Atlanta");
		state1.displayInfo();
	}
	
	
	
	
}
