package class06_Switch_Case;

import java.util.Scanner;

public class ReplHw {

	public static void main(String[] args) {

		Scanner scan;
		scan=new Scanner(System.in);
		int score;
		String eligibility=null;
	System.out.println("Do you need a loan?");
  boolean  loan=scan.nextBoolean();
	if(loan) {
		System.out.println("What is your credit score?");
		score=scan.nextInt();
		if(score<600) {
			eligibility="Not eligible";
		}else if(score>=600 && score<=700) {
			eligibility="Maybe eligible";
		}else if(score>=701 && score<=800) {
			eligibility="Eligible";
		}else if(score>800){
			eligibility="Definitely eligible";
		}System.out.println("The eligibility is "+eligibility );
	}else {
		 System.out.println("The eligibility is Unknown");

	
	}
		
		
		
		
	}

}
