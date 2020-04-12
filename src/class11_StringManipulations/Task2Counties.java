package class11_StringManipulations;

public class Task2Counties {

	public static void main(String[] args) {
		/*
		 * Create an array of countries: north america countries,
		 *  south america countries, europe countries, asian countries, 
		 *  african countries.
		 *   Then print all values from that array using
		 *    2 different loops and calculate how many total countries been stored.
		 */
		
		
		String [][] countries= {
				{"Cuba", "Canada", "CostaRica"},
				{"Brazil", "Argintina", "Urugy", "Chile"},
				{"Poland", "Porigal", "Sweden", "Spain"},
				{"India", "Turkmenistan", "Indonesia"},
				{"Nigeria", "South Africa", "Kenia"},
		};
		for (int r=0; r<countries.length; r++) {
			for (int c=0; c<countries[r].length; c++) {
				System.out.print(countries[r][c] + " ");
		    	System.out.println();
			}
			
			System.out.println();
		}
		for (String [] a:countries) {
			for (String d:a) {
				System.out.print(d+ " ");
			
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
