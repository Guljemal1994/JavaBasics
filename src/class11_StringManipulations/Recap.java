package class11_StringManipulations;

public class Recap {

	public static void main(String[] args) {
		
		
		String[][] groceries= {
				{"Cucumber", "Potato", "Carrot"},
				{"Mango", "Apple", "Banana", "Kiwi"},
				{"Milk", "Cheese", "Yogurt"}
				};
		
		System.out.println(groceries[1][2]);
		
		//get all value 2D array
		//loop through rowa
		for(int r=0; r<groceries.length; r++) {
			//loop through columns
			for(int c=0; c<groceries[r].length; c++) {
				System.out.println(groceries[r][c]);
			}
			
		}
		   System.out.println();
		
		
		System.out.println("-----Getting elements using advanced for loo------");
		System.out.println();//ozim goydum dine arasy acyk bolmasy ucin
		//loops through all arrays
		
		for(String[] array:groceries) {
			//loops througth each single array
			for(String items:array) {
				System.out.print(items+" ");
			}
		System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
