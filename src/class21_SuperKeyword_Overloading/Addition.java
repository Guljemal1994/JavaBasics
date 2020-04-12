package class21_SuperKeyword_Overloading;

public class Addition {

	//Method over loading by changing number of paameters
     void add(int num, int num1) {
    	 System.out.println(num+num1);
     }
	
     void add(int num, int num1,int num2) {
    	 System.out.println(num+num1+num2);
     }
	
     void add(int num, int num1,int num2, int num3) {
    	 System.out.println(num+num1+num2+num3);
     }
	
	//Method overLoading by changing type of paremeters
     void add(double num, double num1) {
    	 System.out.println(num+num1);
     }
    
     void add(double num, double num1, long num3) {
    	 System.out.println(num+num1+num3);
     } 
}
