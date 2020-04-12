package class23_RunTime_Polymorphism;

public class Car {

	String make;
	
	Car(String make){
		this.make = make;
	}
	public void display() {
		System.out.println("I have "+make+" car");
	}
	public void  start() {
		System.out.println(make+" stars witk key turning");
	}
}

class BMW extends Car{
	
	BMW(String make){
		super(make);
	}
	
	public void start() {
		System.out.println(make+" starts with pushing button");
	}
	public void navigate() {
		System.out.println(make+" has navigatte sysytem");
	}
}

class Mercedes extends Car{
	
	Mercedes(String make){
		super(make);
	}
	public void start() {
		System.out.println(make+" starts with remotly");
	}
	public void lights() {
		System.out.println(make+" has pretty lights");
	}
}

class Honda extends Car{
	
	Honda(String make){
		super(make);
	}
	public void start() {
		System.out.println(make+" starts with ly");
	}
}

class Tesla extends Car{
	
	Tesla(String make){
		super(make);
	}
	
}

