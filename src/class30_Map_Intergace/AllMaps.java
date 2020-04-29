package class30_Map_Intergace;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		System.out.println("--Lets create grocery map(item,quantity) in which we do nor care about order--");
		
		Map<String,Integer> grocery = new HashMap<>();
		grocery.put("milk ", 1);
		grocery.put("cocumber ",3);
		grocery.put("banana ", 12);
		grocery.put("cheese ", 2);
		grocery.put("Cocumber ",3);
		grocery.put("grapes ", 6);
		
		System.out.println(grocery);
		
		System.out.println();
		
		System.out.println("--create a map od items to buy (item,quantity) in which we want save the order--");
		
		Map<String, Integer> houseHold = new LinkedHashMap<>();
		houseHold.put("lysol ", 2);
		houseHold.put("paper towel ", 2);
		houseHold.put("sanitizer ", 2);
		houseHold.put("face mask ", 15);
		houseHold.put("dish soap ", 1);
		System.out.println(houseHold);
		
		
		System.out.println();
		
		
		System.out.println("--create one shopping list--");
		System.out.println("== create a map in which we store all previous items in ascending order==");
		Map<String, Integer> shopping = new TreeMap<>(grocery);
		//shopping.putAll(grocery);//this way also possible
		shopping.putAll(houseHold);
		System.out.println(shopping);
		
		System.out.println();
		
		
		System.out.println("--get all keys---");
		for(String key: shopping.keySet()) {
			System.out.println("Key = "+key);
		}
		 
		System.out.println();
		
		
		System.out.println("==get all keys using iterator==");
		Iterator <String> keys = shopping.keySet().iterator();
		while(keys.hasNext()) {
			System.out.println("key -->"+keys.next());
		}
	
	    System.out.println();
	
	System.out.println("-- get all values---");
	for(int val : shopping.values()) {
		System.out.println("Values==> "+val);
	}
	
	
	System.out.println();
	
	System.out.println("---get all values using iterator---");
	Iterator <Integer> it = shopping.values().iterator();
	while(it.hasNext()) {
		System.out.println("Values--> " + it.next());
	}
	 
	
	
	}

}
