package class28_LinkedList;

public abstract class Food {

	String foodTypr;// 3 variables
	String ingredient;
	int calories;
	
	public Food(String foodTypr, String ingredient, int calories) {//comstructor
		this.foodTypr = foodTypr;
		this.ingredient = ingredient;
		this.calories = calories;
	}
	public abstract void foodTypr();// 3 undefine methods
	public abstract void ingredient();
	public abstract void calories();
}

class Soup extends Food{

	public Soup(String foodTypr, String ingredient, int calories) {
		super(foodTypr, ingredient, calories);
		
	}

	@Override
	public void foodTypr() {
		System.out.println(foodTypr+" is a common appetizer in Turkey");
		
	}

	@Override
	public void ingredient() {
		System.out.println(foodTypr+" has main ingredient of "+ingredient);
		
	}

	@Override
	public void calories() {
		System.out.println("1 serving of "+foodTypr+" ha "+calories+" calories");
		
	}
	
}

class Salad extends Food{

	public Salad(String foodTypr, String ingredient, int calories) {
		super(foodTypr, ingredient, calories);
	}

	@Override
	public void foodTypr() {
		System.out.println(foodTypr+" is a comman sidedish in turkey ");
		
	}

	@Override
	public void ingredient() {
		System.out.println(foodTypr+" has the main ingredien of "+ingredient);
		
	}

	@Override
	public void calories() {
		System.out.println("1 serving of "+foodTypr+" ha "+calories+" calories");		
	}	
}

class MainDish extends Food{

	public MainDish(String foodTypr, String ingredient, int calories) {
		super(foodTypr, ingredient, calories);
	}

	@Override
	public void foodTypr() {
		System.out.println(foodTypr+" is a comman main dish in turkey ");
		
	}

	@Override
	public void ingredient() {
		System.out.println(foodTypr+" has the main ingredien of "+ingredient);
		
	}

	@Override
	public void calories() {
		System.out.println("1 serving of "+foodTypr+" ha "+calories+" calories");
		}
	}
class Dessert extends Food{

	public Dessert(String foodTypr, String ingredient, int calories) {
		super(foodTypr, ingredient, calories);
		
	}

	@Override
	public void foodTypr() {
		System.out.println(foodTypr+" is a comman dessert in turkey ");		
	}

	@Override
	public void ingredient() {
		System.out.println(foodTypr+" has the main  of "+ingredient);
		
	}

	@Override
	public void calories() {
		System.out.println("1 serving of "+foodTypr+" ha "+calories+" calories");
		
	}
	
}
