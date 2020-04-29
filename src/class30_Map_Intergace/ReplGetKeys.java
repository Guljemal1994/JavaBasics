package class30_Map_Intergace;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ReplGetKeys {

	public static void main(String[] args) {
		
		
		Map<String , Integer> key = new HashMap<>();
		key.put("Oragnge", 10);
		key.put("Apple " , 20);
		key.put("Oragnge", 10);
		key.put("Apple " , 20);
		
		Set<String> keys = key.keySet();
		for (String k : keys) {
			
		}

		Iterator<String> kIt =keys.iterator();
		while (kIt.hasNext()) {
			String key1 = kIt.next();
			System.out.println("Key = " + key1 + " and value is " + key.get(key1));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
