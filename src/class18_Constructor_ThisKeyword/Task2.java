package class18_Constructor_ThisKeyword;

public class Task2 {

	public static String getReverse (String str) {
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverse += str.charAt(i); 
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		
		Task2 obj = new Task2();
		String str = getReverse("Julia"); 
		System.out.println(str);
		System.out.println(getReverse("Good"));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
