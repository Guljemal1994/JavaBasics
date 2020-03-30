package only.task;

public class Repl128_1 {

	
	static int countVowels(String str) {
		
		int sum =0;
		for(int i=0; i<str.length(); i++) {
      if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u'){
			      sum++;
			    }
		}
		return sum;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countVowels("obama")); //3
		System.out.println(countVowels("happy friday! i love weekends")); //9
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
}