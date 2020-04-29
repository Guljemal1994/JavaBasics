package class30_Map_Intergace;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapWithIterator {

	public static void main(String[] args) {
		
		Map<String, String> jemka = new LinkedHashMap<>();

		jemka.put("Street", "Patrick ST");
		jemka.put("Suite", "265");
		jemka.put("city", "Vienna");
		jemka.put("Zip", "22180");
		jemka.put("Country", "United State");

		Set<String> keys = jemka.keySet();
		for(String s:jemka.values()) {
			
		}
		Iterator<String> it = jemka.values().iterator();
		while(it.hasNext()) {
			 
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
