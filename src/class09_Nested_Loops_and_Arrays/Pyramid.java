package class09_Nested_Loops_and_Arrays;

public class Pyramid {

	public static void main(String[] args) {
		
		for(int r=1; r<=4; r++) {
			for( int c=1; c<=r; c++) {
				System.out.print("*");
			}
	          System.out.println();
		}
		
		
		
		System.out.println("trying wwith numbers number");
		
		
		for(int r=1; r<=5; r++) {
			for( int c=1; c<=r; c++) {
				System.out.print(c+" ");
			}
	          System.out.println();
		}
		
		
		
		

		System.out.println("tyring with same numbers number");
		
		
		for(int r=1; r<=5; r++) {
			for( int c=1; c<=r; c++) {
				System.out.print(r+" ");
			}
	          System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
