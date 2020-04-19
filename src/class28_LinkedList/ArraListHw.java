package class28_LinkedList;

import java.util.ArrayList;

public class ArraListHw {

	public static void main(String[] args) {
		
		
		ArrayList<String> drink = new ArrayList<>();
		
		drink.add("Coce");
		drink.add("Bilo - Colo");
		drink.add("kakao");
		drink.add("Seltser");
		drink.add("Apple sok");
		drink.add("Orange juice");
		drink.add("Coconut sok");
		drink.add("Mango Juice");
		
		for(String dr: drink) {
			dr = dr.toLowerCase();
			if(dr.contains("e") || dr.contains("a")) {
				dr = dr.replaceFirst(dr, "water");
			}
			System.out.println(dr);
		}
		System.out.println(drink);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
