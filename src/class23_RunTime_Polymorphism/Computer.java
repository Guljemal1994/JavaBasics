package class23_RunTime_Polymorphism;

public class Computer {

	String brand;
	public Computer(String brand) {
		this.brand=brand;
	}
	public void run() {
		System.out.println(brand+" has run system");
	}
	public void save() {
		System.out.println(brand+(" has save system"));
	}
	public void screenShot() {
		System.out.println(brand+" has screen Shot system");
	}
	public void transfer() {
		System.out.println(brand+" can transfer information");
	}
}

class Apple extends Computer{
	
	public Apple(String brand) {
		super(brand);
	}
	public void run() {
		System.out.println(brand+" has a faster system");
	}
	public void save() {
		System.out.println(brand+" can save easly");
	}
	public void screenShot() {
		System.out.println(brand+" has screen shot");
	}
	public void transfer() {
		super.transfer();
	}
}

class Lenove extends Computer{
	
	public Lenove(String brand) {
		super(brand);
	}
	public void ran() {
	    super.run();
	    
	    transfer();
	}	
	}

class HD extends Computer{
	
	public HD(String brand) {
		super(brand);
	}
	}


