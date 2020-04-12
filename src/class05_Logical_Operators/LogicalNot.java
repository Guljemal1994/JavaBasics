package class05_Logical_Operators;

public class LogicalNot {

	public static void main(String[] args) {
		
		boolean b=!true;
		boolean val=!false;
		
		
		System.out.println(b);
		System.out.println(val);
		
		
		boolean isCold=true;// try false
		if(!isCold) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		
		
		String day1="Tuesday";
		
		//if it is not monday or friday-->find me in syntax 
			if(!(day1.equals("Monday") && !day1.equals("Friday"))) {
				System.out.println("Find me in syntax");
			}
		
		// my day is not Monday and my is not friday
			
			if(!(day1.equals("Monday") || day1.equals("Friday"))) {
				System.out.println("Find me in syntax");
			}
		
		
	}

}
