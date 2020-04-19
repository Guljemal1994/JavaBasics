package class27_ArrayList_and_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {

	public static void main(String[] args) {
		
        //3. Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 
	
	ArrayList <String> wt = new ArrayList<>();
	wt.add("Juice");
	wt.add("Coffee");
	wt.add("Mountain Dew");
	
	Iterator<String> dr = wt.iterator();
	while (dr.hasNext()) {
		String gul = dr.next();
		if(gul.contains("a") || gul.contains("e")) {
			String guls = gul.replaceAll(gul, "Water");
			System.out.println(guls);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
	
}
