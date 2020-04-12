package class05_Logical_Operators;

import java.util.Scanner;

public class Hw01 {

	public static void main(String[] args) {
	    	//Write a program that will read three inputs of scores 
	    	//(quiz, mid term, and final scores) and determine 
		    //the grade based on the following rules: 
			//if the average score >=90---- grade=A
			//if the average score >= 70 and <90  grade=B
			//if the average score>=50 and <70 grade=C
			//if the average score<50  grade=F

        
        
        Scanner scan=new Scanner (System.in);
       
        System.out.println("What is your quiz score ");
        int quiz=scan.nextInt();
        
        System.out.println("What is your mid term score");
        int mid=scan.nextInt();
        
        System.out.println("What is your final scores");
        int fina=scan.nextInt();
        
        int avarage=quiz+mid+fina/3;
		String gul=scan.nextLine();
		
		if(avarage>=90) {
			gul="A";
		}else if(avarage>=70 && avarage<90) {
			gul="B";
		}else if (avarage>=50 && avarage<70) {
			gul="C";
		}else if (avarage<50) {
			gul="F";
		}
		System.out.println("Your score "+gul);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void nextInt() {
		// TODO Auto-generated method stub
		
	}

}
