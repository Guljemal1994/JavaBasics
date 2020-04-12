package class18_Constructor_ThisKeyword;

public class Car {

	String make, model, color;//default vale of String null
	int year;//default vale of int 0
	
	public void printDeails() {
		System.out.println("I have "+year+" "+make+" "+model+" in "+color+" color");
	}
	
	public static void main(String[] args) {
		
		Car car = new Car();
		car.make = "BMW";
		car.model = "m5";
		car.color = "RED";
		car.year = 2020;
		car.printDeails();
		
		System.out.println("*****************************************************");
		
		
		
		Car car1 = new Car();//new Car(); constrotor
		//car1.printDeails();//eger initialize etman yazsan  0 ya null cykya
		//we are useing instance variable without assing any value 
		//constructo initializes all instance variable and assign default value to thwm
		System.out.println(car1.year);//null
		
//		int doors ;
//		System.out.println(doors);CE:local variable must be initialized
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
}
