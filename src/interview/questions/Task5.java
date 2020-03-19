package interview.questions;

public class Task5 {

	public static void main(String[] args) {
		
		/*
		 * Write a java program to reverse String? Reverse a string word by word?
		 * Our Input - Critical Thinking
		 * Our OutPut - lacitirc gnikniht
		 * 
		 */
		//declare String and assign the value
		String str = "Critical Thinking";
		
		//create array of word
		String[] words = str.split(" ");
		
		//create reverse String
		String revString = "";
		
		for(int i = 0; i< words.length; i++) {
			String word = words[i];
			String revWord = "";
			// Critical
			for(int j = word.length()-1; j >=0; j--) {
				revWord = revWord + word.charAt(j);//lacitirc
				
			}
		       revString =revString + revWord +" ";//lacitirc gnikniht 
		}
		
		System.out.println(revString);
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
