package class28_LinkedList;

import java.util.ArrayList;

public class WhyIteratorToRemove {

	public static void main(String[] args) {

		ArrayList<String> drink = new ArrayList<>();

		drink.add("water");
		drink.add("milk");
		drink.add("milk");
		drink.add("juice");
		drink.add("tea");
		drink.add("tea");
		drink.add("coffee");
		System.out.println(drink);
		
		System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
		//we need to remove all milk and tea String ebjects
		for(int i=0; i<drink.size(); i++) {
			if(drink.get(i).contentEquals("milk") || drink.get(i).equals("tea")) {
				drink.remove(i);
			}
		}
		System.out.println(drink);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
