package class25_Interface;

public interface Drivable {
     
	//compiler by default adds public static final
	boolean MOVE_FAST = true;
	
	//compiler  by default adds public abstract
	void drive();
}

abstract class Vehicles{//we cannot creat object of Vehicles 
	
	abstract void stop();
}
//achieving multiple inheritance
class Cars extends Vehicles implements Drivable{//2 classes

	@Override
	public void drive() {
		System.out.println("Car drives");
	}

   @Override
     void stop() {//implimintation
	   System.out.println("Car stops");
 }
}
