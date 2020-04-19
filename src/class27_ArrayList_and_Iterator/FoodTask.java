package class27_ArrayList_and_Iterator;

public abstract class FoodTask {
/*
 * hw create food class that will have 3 undefined methods and it will have 4 subclasses;
 *  create a collection of food and using 3 ways execute methods
 */
	
 public abstract void healthyFoods();
 public abstract void fruitSalad();
 public abstract void snackFoods();
}
class Yogut extends FoodTask{
    @Override
	public void healthyFoods() {
		System.out.println("eat healthy foods ");
	}
	@Override
	public void fruitSalad() {
		System.out.println("Fruit salad is the best");
}
    @Override
	public void snackFoods() {
		System.out.println("Snacks ");
	}
}
class Fruit extends FoodTask {

	@Override
	public void healthyFoods() {
		System.out.println("eat helthy stay long");

	}

	@Override
	public void fruitSalad() {
		System.out.println("Fruit is good for you");
	}

	@Override
	public void snackFoods() {
		System.out.println("Snacks");
	}
}
class Nuts extends FoodTask {

	@Override
	public void healthyFoods() {
		System.out.println("fast foods are not healthy");

	}

	@Override
	public void fruitSalad() {
		System.out.println("Fruit salad");
	}

	@Override
	public void snackFoods() {
		System.out.println("Snacks");

	}

}
