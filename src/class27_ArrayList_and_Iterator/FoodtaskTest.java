package class27_ArrayList_and_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodtaskTest {

	public static void main(String[] args) {

		ArrayList<FoodTask> f = new ArrayList<>();
		f.add(new Yogut());
		f.add(new Fruit());
		f.add(new Nuts());

		System.out.println("==>advanced for loop<==");
		for (FoodTask food : f) {
			food.fruitSalad();
			food.healthyFoods();
			food.snackFoods();
		}
		System.out.println();

		System.out.println("==>iterator<==");
		Iterator<FoodTask> fd = f.iterator();
		while (fd.hasNext()) {
			FoodTask gul = fd.next();
			gul.fruitSalad();
			gul.healthyFoods();
			gul.snackFoods();
		}
		System.out.println();

		System.out.println("==>for lopp<===");
		for (int i = 0; i < f.size(); i++) {
			f.get(i).fruitSalad();
			f.get(i).healthyFoods();
			f.get(i).snackFoods();
		}
	
	
	
}
}
