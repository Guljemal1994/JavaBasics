package class18_Constructor_ThisKeyword;

public class Task3 {

	private static	String getVawules(String str) {
		
	String vowules;
		vowules = str.replaceAll("[^aeiouAEIOU]","");
		return vowules;
	}
	
	public static void main(String[] args) {
		String vowules = getVawules("Hello");
		System.out.println(vowules);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
