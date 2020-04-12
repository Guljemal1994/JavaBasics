package class19_ThisKeyword_Inheritance;

public class USA {

	String state, stateCapital;
	
	public USA(String state, String stateCapital) {//my own constructor
		this.state=state;//TX
		this.stateCapital=stateCapital;//Austin
	}
	
	public void displayState() {
		System.out.println(state);
	}
	public void displayCapital() {
		System.out.println(stateCapital);
	}
	
	public static void main(String[] args) {
		
	
	USA obj = new USA("Tx","Austin");//two string values
	obj.displayState();
	obj.displayCapital();
	
	
	
	
	
	
	
	}
	
	
	
}
