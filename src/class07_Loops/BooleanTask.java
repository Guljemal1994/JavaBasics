package class07_Loops;

public class BooleanTask {

	public static void main(String[] args) {
		boolean workDay=true;
		int day=1;
		 while (workDay) {
			 if(day<6) {
					System.out.println("I need a day off");
		 }else {
			 System.out.println("Do not need a day off");
		      workDay=false;
		 }
		     day++;
			
			
		    }
		

	
}
}