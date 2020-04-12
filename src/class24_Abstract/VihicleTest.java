package class24_Abstract;

public class VihicleTest {

	public static void main(String[] args) {
		
		Vehicle tels=new Tesla ("yellow", "sedan", "tesla");
		tels.drive();
		tels.stop();
		tels.brake();
		tels.start();
		//tels.display();CE: method is not defined in Vihicle class
		
		 new Toyota("red", "sedan", "toyota");
		 new Toyota("blue", "sedan", "toyota1");
		 Vehicle.total();
	}
}
