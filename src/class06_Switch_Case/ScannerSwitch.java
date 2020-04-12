package class06_Switch_Case;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {
		/*
		 * sk a gender: F or M
		 * based on the gender will ptovde description
		 */
		
		
		Scanner scan;
		char gender;
		String genderType;
		
	scan=new Scanner(System.in);
	System.out.println("Please enter your gender M or F");
	gender=scan.next().charAt(0);
	
	
	switch(gender) {
	case 'M':
		genderType="Male";
		break;
	case'F':
		genderType="Female";
		break;
		default:
			genderType="Unknown";
	
	}
		
		System.out.println("Your gender is "+ genderType);
		
		
		
				
		
		

	}

}
