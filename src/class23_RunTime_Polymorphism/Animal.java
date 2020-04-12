package class23_RunTime_Polymorphism;

public class Animal {

	public static void whoAmI() {
		System.out.println("I am an animal");
	}
	public void sleep() {
		System.out.println("All animals sleep");
	}
	private void eat() {
		System.out.println("Animals can eat");
	}
}

class Bird extends Animal{

//@Override we are not overriding this process calls method hidding
	public static void whoAmI() {
		System.out.println("I am a bird");
	}
	public void sleep() {
		System.out.println("All birds sleep");
	}
	private void eat() {
		System.out.println("birds can eat too");
	}
}
