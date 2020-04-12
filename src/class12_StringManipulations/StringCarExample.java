package class12_StringManipulations;

public class StringCarExample {

	public static void main(String[] args) {
		
		
		String car = "I have a Toyota";
		car = car.replace("Toyota", "Lexus");
		System.out.println(car);
		
		System.out.println("---replace()---FUNCTION---");
		
		String str = "Phone number is 2121366448";
		System.out.println(str);
		str = str.replaceAll("[A-Za-z]","");
		System.out.println(str);///duzeltmeli
		
		
		
		String str1 = "Hello1234**&&**  !! 89";
		str1=str1.replaceAll("[0-9]","");
		System.out.println(str1);
		
		
		str1= str1.replaceAll("[A-Za-z]","");//only spectial charcters 
		System.out.println(str1);
		
		
		
		str1= str1.replaceAll("[^A-Za-z]","");
		System.out.println(str1);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
