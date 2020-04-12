package class23_RunTime_Polymorphism;

public class CarTest {

	public static void main(String[] args) {
		
		Car bmw = new BMW("BMW");
		bmw.display();
		bmw.start();
		//bmw.lights CE:undefined method in car
		Car mer = new Mercedes("Mercedes");
		Car hon = new Honda("Honda");
		Car tes = new Tesla("Tesla");
		
		//Car[] cars = {bmw,mer,hon,tes}; 1st way
		
		//2nd way
  Car[] cars = {new BMW("BMW"),new Mercedes("Mercedes"),new Honda("Honda"),new Tesla("Tesla")};
	
  for(Car c:cars) {
	  c.start();//haysyny goysam sol 1-nji cykya
	  c.display();
	  System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	  
  }
  System.out.println("*#*#*#*#*#**#*#*#*#*#*#*#*#*#**#*#*#*#");
		
  for(int i=0; i<cars.length; i++) {
	  cars[i].start();//haysyny ulaasyn gelse ularyp bilyan yakarkynam asakynam
	  cars[i].display();
	  
  }
		
		
		
		
		
		
	}
}
