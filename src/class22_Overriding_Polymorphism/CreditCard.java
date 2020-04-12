package class22_Overriding_Polymorphism;

public class CreditCard {

	int balance;
	double interest;
	
	CreditCard(int balance){
	this.balance=balance;
	}
	
	void interest() {
	
		if(balance>500) {
	interest+=balance*0.25;
	
		}else {
	interest+=0;
	}System.out.println(interest);
	}
	}

class Visa extends CreditCard{
	
	Visa(int balance){
	super(balance);
	}
	@Override
	protected void interest() {
	
		if(balance>500) {
	interest+=balance*0.3;
	
		}else {
	interest+=0;
	}System.out.println(interest);
	}
}
class Ax extends CreditCard{
	
	Ax(int balance){
	super(balance);
	}
	
	public void interest() {
	
		if(balance>500) {
	interest+=balance*0.4;
	}else {
	interest+=0;
	}System.out.println(interest);
	}
}
	

