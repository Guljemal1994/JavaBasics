package class22_Overriding_Polymorphism;

public class Bank {

	double money, fee;
	
	public  Bank(double money) {//constructor creats witk class name
       this.money = money;
	}
	double chargeFee() {//over ridden method
		if(money<10000) {
			fee = money*0.1;
		}else {
			fee=0;
		}
		return fee;
	}
}
class PNC extends Bank{
	
	public PNC(double money) {
		super(money);
	}
	@Override
	double chargeFee() {// overrriding method
		if(money<1000) {
			fee = money*0.2;
		}else {
			fee = 0;
		}
		return fee;
	}
}
class TD extends Bank{
	
	public TD(double money) {
		super(money);
	}
	double chargeFee() {
		if (money<1000) {
			fee = money*0.3;
		}else {
			fee =0;
		}
		return fee;
	}
}

class BOA extends Bank{
	
	public BOA(double money) {
		super(money);
		}
	
}
