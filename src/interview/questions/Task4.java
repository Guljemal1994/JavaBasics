package interview.questions;

public class Task4 {

	public static void main(String[] args) {
		
		 /* Find number of words in string? arzu
		 */
				System.out.println(".... letter Numbers(alpha characters) in String.......First Way.....");
				String str = "I am a Physics Teacher";
				String letters;
				int alphacharac = 0;
				letters = str.replace(" ", "");// to convert string into only letters
				for (int i = 1; i <= letters.length(); i++) {
					alphacharac =i;
				}
		System.out.println(letters);
				System.out.println("Numbers of alpha characters = " + alphacharac);
		System.out.println("   ");
				/* 2 nd way to find alpha character numbers */
				System.out.println(".... letter Numbers in String.......Second Way.....");
				str = str.replaceAll("[^A-Za-z]", "");
				System.out.println("Numbers of alpha characters = " + str.length());
		System.out.println("   ");
				/* Find number of words in string? */
			//1 WAY	
				System.out.println(".... Words Numbers in String.....");
				str = "I am a Physics Teacher";
				// to count the words in String we need to split spaces so we will use split() function
				// when we use split function we will cut the spaces and we will create new strings."I'm", "a","Physics","Teacher"
				String[] words= str.split(" "); // we can't store more strings in basic string class so we need to String  array
				                                 // for that reason we create a String array and store the new strings in it.
				System.out.println(words.length); // words.length give us element numbers
												  // each string is an element also word
		System.out.println("   ");
		//2 Way  after create String array
		//I want to print String array word by word and count the words
				int count = 0;
				for (int i = 0; i < words.length; i++) { // for check the indexes start from zero
					count = i + 1; // element number= final index number+1
					System.out.print(words[i] + " ");
				}
				System.out.println();
				System.out.println("   ");
				System.out.println("word numbers "+ count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
