package class10__Arrays_and_2D_Arrays;

public class Repl79 {

	public static void main(String[] args) {
		
		//teachers way
		double[][] l = { 
				{ 1.4, 2.0, 3.3, 2 }, 
				{ 4, 1.5, 6.1, 1 }, 
				{ 1.2, 3.1, 4, 1.6 } 
				};
		// prints array
		for (int i = 0; i < l.length; i++) {
			for (int j = 0; j < l[i].length; j++) {
				System.out.print(l[i][j] + " ");
			}
			System.out.println();
		}
	
		
		System.out.println("----Do not confuse----");
		
		//my way
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			//prints array
	  
	 System.out.print(a[0][0]+" ");
	 System.out.print(a[0][1]+" ");
	 System.out.print(a[0][2]+" ");
	 System.out.print(a[0][3]+" ");
	 System.out.println();
	 System.out.print(a[1][0]+" ");
	 System.out.print(a[1][1]+" ");
	 System.out.print(a[1][2]+" ");
	 System.out.print(a[1][3]+" ");
	 System.out.println();
	 System.out.print(a[2][0]+" ");
	 System.out.print(a[2][1]+" ");
	 System.out.print(a[2][2]+" ");
	 System.out.print(a[2][3]+" ");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
