package class10__Arrays_and_2D_Arrays;

public class Repl842D {

	public static void main(String[] args) {
		//my way
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
		
		    int s = 0;
		    for(int i = 0; i<a.length; i++) {
		    	for(int w = 0; w<a[i].length; w++) {
		    		if(i % 2 == 0) {
		    			s = s - a[i][w];
		    		}
		    	}
		    }
		       System.out.println(s);
		
		
		
		
		
		System.out.println("----Teachers way-----");
		int[][] numbers = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
	//should print 3
		int countNegative = 0;
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers[j].length; i++) {
				if (numbers[j][i] < 0 && numbers[j][i] % 2!=0) {
					countNegative = countNegative+i;
				}
			}
		}
     System.out.println(countNegative);
		
		
		
		
		
		
		
		
		
		
	
	}

}
