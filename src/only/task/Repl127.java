package only.task;

public class Repl127 {

	static int countA(String s){
	int sum=0;
	  for(int i= 0;i<s.length();i++ ){
	    if(s.charAt(i) == 'A'){
	      sum++;
	    }
	    if(s.charAt(i) == 'a'){
	      sum++;
	    }
	  }
		return sum;
	}
	
	//test case below (dont change):
	public static void main(String[] args){
		System.out.println(countA("aaA")); //3
		System.out.println(countA("aaBBdf8k3AAadnklA")); //6
	
	
	
		}	
	
	
}
