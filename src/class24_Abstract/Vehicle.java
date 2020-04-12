package class24_Abstract;

public abstract class Vehicle {
	
	static int total;//static variable will sahe with all calss
	
	String color;//instance variable
	
	Vehicle(String color){//constructor
		this.color = color;
		total++;
	}
	public static void total() {//we can have a static implimentation
		System.out.println("we build "+total);
	}
	
	public void drive() {//instance methods
		System.out.println("Vehical  drives");
	}
	public void stop() {//instance methods
		System.out.println("Vehical  stops");
	}
	
	public abstract void start();
	
	public abstract void brake();
	 
	//can abstract method be static? No
	//public abstract static void m1();
	
	//can abstract can be final?NO
	//public abstract final void m2();
	
	//can abstract method be private? NO
	//private abstract void m3();
}

abstract class Car extends Vehicle{//as a childs i can define my own feature

	String carType;
	
	Car(String color , String carType) {
		//super - call to the cons always must be 1st
		super(color);//with super I am calling constructor
		this.carType = carType;
	}
	public void brake() {
		System.out.println(carType+" have a brake");
	}
}
class Tesla extends Car{//

	 String make;
	 
	 Tesla(String color, String carType, String make) {
		super(color, carType);//2 values
		this.make = make;
	}
	 public void drive() {
		 System.out.println(make+" drives on autopilot");
	 }

	 @Override
	public void start() {
		System.out.println(make+" starts remotly");
	}
	 public void display() {
		 System.out.println("We have "+color+" "+make+" "+carType);
	 }
	
}
class Toyota extends Car{

	String make;
	
	Toyota(String color, String carType,String make) {
		super(color, carType);
		this.make = make;
	}

	@Override
	public void start() {
		System.out.println(make+" starts without keys");
	}
	
}