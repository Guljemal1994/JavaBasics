package class15_Methods_in_Java;

public class ReturnAllOneLine {

	public static void main(String[] args) {
		ReturnAllOneLine n = new ReturnAllOneLine();
		//how to print one character at a time on one line
		//input:sssssyyynnnntaaaaxx output:syntax
		System.out.println(oneChar("sssssyyynnnntaaaaxx"));
		
}

	static String oneChar(String word) {
		if(word.contains("S") || word.contains("y") || word.contains("n") || word.contains("t")|| word.contains("a")
				|| word.contains("x")) {
			
			word="Syntax";
		}
		return word;
	}
      
}
