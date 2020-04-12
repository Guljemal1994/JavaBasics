package class10__Arrays_and_2D_Arrays;

public class RetriveAllElements {

	public static void main(String[] args) {

       // create an array to fruits and retrieve all elements
		
		String[] fruits = {"Banana", "Kiwi", "Apple", "Mango"};
		//if fruit is apple--> thay is your favorite fruit
		//advanced for loop enhanced for loop, for each loop
		
		for(String fruit:fruits) {
			if(fruit.equals("Apple ")) {
				System.out.println(fruit+" is your favorite fruit");
			}else {
				System.out.println(fruit);
			}
				
		}
		
		
		System.out.println("-------------------");
		//regular for loop
		//fruits.lenght=number of elemts
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		
		
		String[] g = {"This"," is ","array ", "of ", " string"};
		for(String h:g) {
			System.out.print(h);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
