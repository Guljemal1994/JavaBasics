package class05_Logical_Operators;

import java.util.Scanner;

public class Hw02 {

	public static void main(String[] args) {
		

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Witch month were you born");
		String month=scan.nextLine();
		String season;
		
		if (month.equals("December") || month.equals("January") ||month.equals("February")){
			season="Winter";
		}else if (month.equals("March") || month.equals("April") ||month.equals("May") ) {
			season="Spring";
		}else if (month.equals("June") || month.equals("July") ||month.equals("August")) {
			season="Summer";
		}else if (month.equals("September") || month.equals("October") ||month.equals("November")) {
			season="Fall";
		}else {
			season="Unknown";        
		}
		System.out.println("You were born " +season);
		
		
		
		
		
		
		
	}

}
