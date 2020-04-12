package class10__Arrays_and_2D_Arrays;

public class Repl81And2D {
public static void main(String[] args) {
	
	// my way
	int[][] a = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};

     for(int i=2; i<a.length; i++){
       System.out.println(a[2][0]);
     }
	
     
     
     
     System.out.println("====================================");
	//teachers way
 	int[][] numbers = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};
//should be 8
	
	 int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        System.out.println(maxValue);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
