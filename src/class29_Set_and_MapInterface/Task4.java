package class29_Set_and_MapInterface;

import java.util.Map;
import java.util.TreeMap;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Create a map of a building. Store floor number and it is associated company
		 * name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate
		 * keys and values. Check how many entries you have? Update company on a 4th
		 * floor Remove company on the 7th floor Print your map
		 */

		Map<Integer, String> comName = new TreeMap();

		comName.put(1, " Apple");
		comName.put(2, " Ebay");
		comName.put(3, " Instagram");
		comName.put(4, " Auto");
		comName.put(5, " Google");
		comName.put(6, " Microsoft");
		comName.put(7, " USPS");

		System.out.println("Company names =>" + comName);
        
		System.out.println();
		System.out.println("Entries => " + comName.size());
		
		System.out.println();
		System.out.println("-----After  Modified------------------");
		comName.replace(4, "ATM");
		System.out.println(comName);
		
		System.out.println();
		System.out.println("----After I  Remove Company from 7th floor----");
		comName.remove(7);
		System.out.println(comName);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
