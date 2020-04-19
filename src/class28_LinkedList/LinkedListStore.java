package class28_LinkedList;

import java.util.LinkedList;

public class LinkedListStore {

	public static void main(String[] args) {
		
		
		LinkedList<Food> food = new LinkedList<>();
		food.add(new Salad("Salad","cocumber and avacado",100));
		food.add(new Soup("Corba","Carrot", 109));
		food.add(new Dessert("Midavik","Honey",200));
		food.add(new MainDish("Pasta","meet",350));
		
		System.out.println("---using advanced foor loop---");
		for(Food f : food) {
			f.foodTypr();
			f.ingredient();
			f.calories();
			System.out.println("--------------------------");
		}
		
		
		
		
		
		
		
		
		
		
	}
}
