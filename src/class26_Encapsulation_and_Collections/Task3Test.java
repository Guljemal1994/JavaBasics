package class26_Encapsulation_and_Collections;

public class Task3Test {

	public static void main(String[] args) {
		
		
		Car tr = new Truck(20000.0, "Grey", 3000);
		System.out.println(tr.calculateSalePrice());
		
		Car sd = new Sedan(10000.0,"Black",30);
		System.out.println(sd.calculateSalePrice());
		
		
		
		

	}

}
