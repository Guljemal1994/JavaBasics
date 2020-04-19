package class26_Encapsulation_and_Collections;

public class EnRepl {

	private String name;
	private int age;
	
	public String getName() {
		return name;
		
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	

	public static void main(String[] args) {
		
		EnRepl obj = new EnRepl();
		obj.setName("Matia", 30);
		System.out.println(obj.getName());
		System.out.println(obj.age);
		
		
	
}
	
	
	
}
