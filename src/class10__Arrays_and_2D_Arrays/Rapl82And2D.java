package class10__Arrays_and_2D_Arrays;

public class Rapl82And2D {

	public static void main(String[] args) {
		//my way
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
		
		       int min=a[0][0];
		       for(int k=0; k<a.length; k++) {
		    	   for(int i=0; i<a[k].length; i++) {
		    		   if(a[k][i]<min) {
		    			  min=a[k][i]; 
		    		   }
		    	   }
		       }
		     System.out.println(min-4);
		
		
		
		System.out.println("---Teachers way -----");
		     int[][] a1 = {
		 			{-5,-2,-3,7},
		 			{1,-5,-2, 2},
		 			{1,-2, 3,-4}
		 		};
		    int sum = 0;
		   		for (int i = 0; i < a1.length; i++) {
		   			for (int j = 0; j < a1[i].length; j++) {
		   				sum = sum + a1[i][j];
		   
		   			}
		   		}
		   		System.out.println(sum);
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
