package only.task;

public class Repl133 {

	static String str;
	public static String  alphabetical(String str){
	 char previous = str.charAt(0);
			char current;
			String newString = "" + previous;
			for (int i = 1; i <= str.length()-1; i++) {
				current = str.charAt(i);
				if (current > previous) {
					newString += str.charAt(i);
				}
				previous = current;
			}
			return newString;
		}
		//test case below (dont change):
		public static void main(String[] args){
			System.out.println(alphabetical("hello")); //"hlo"
			System.out.println(alphabetical("software"));//"stwr"
			System.out.println(alphabetical("language"));//"lnug"
	}}
	
	
	
	
	



















	
	
	
	
	

