package class17_Access_Modifiers;

public class Task3 {

//	all elements from that array. Method should be visibly only within same package 
//	and accessible by the creating an instance of the class.
//	2.Create a method that will take a String as a parameter and returns reverse String.
//	Method should be available to all classes within your projects and accessible by class name.
//	3.Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 
	//Method should be available inside the class where it was declared and executed by calling it is name.
	protected int method1(int[] array) {
		int sum = 0;
		for(int i =0; i<array.length; i++) {
			sum+=array[i];
		}
		return sum;
	}
	protected String reverse(String given) {
		String reversed="";
		for(int i=given.length()-1; i>=0; i--) {
			reversed = reversed+given.charAt(i);
		}
		return reversed;
	}
	public static void main(String[] args) {
		int[] array= {43, 32, 12, 1,8,22};
		Task3 obj = new Task3();
		int sum1 = obj.method1(array);
		System.out.println(sum1);
		String str = obj.reverse("Hello world!");
		System.out.println(str);
	}
}
	
	
	
	
	 
	
	
	
	
	
	
