package only.task;

public class Repl113 {
	
//	an integer
//	Name:
//	sumEvenToX
//	Parameters:
//	an integer called "x"
//	Purpose:
//	calculate the sum of the EVEN integers from 1 to x (including x)
//
//	Examples:
//	sumEvenToX(5) ==> 6
//	sumEvenToX(8) ==> 20
//			
        // public static  main(String[] args) {
//		      int sum = s(10,10);
//        	 int sumEvenToX = x(3,3);
//      System.out.println(sumEvenToX);
//        	 
//}
//
//private static int s(int a, int b) {
//	 
//	return a+b;
//}
//
//private static int x(int i, int j) {
//	
//	return i+j;
//
        	 
	public int sumEvenToX(int x)	{
		 
		int sum=0;
		for(int i=1;i<=x;i++) {
			if(i%2==0) {
			sum+=i;
		  }
		}
		return sum ;
	}
	
			public static void main(String[] args){
			  Repl113 obj=new Repl113();
				System.out.println(obj.sumEvenToX(5)); 
				System.out.println(obj.sumEvenToX(8)); 
			}
		
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         	
}
 