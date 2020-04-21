package class30_Map_Intergace;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MoreMapWays {

	public static void main(String[] args) {

		Map<Integer, String> b = new LinkedHashMap<>();
		b.put(1, "Google");
		b.put(2, "Syntax");
		b.put(3, "Amazon");
		b.put(4, "Amazon");
		b.put(5, "HP");
		b.put(6, "Microsoft");
		b.put(7, "Oracle");

		System.out.println(b.size());// 7
		System.out.println(b);// all com name

		System.out.println("==>how to get all keys 1st way<==");
		Set<Integer> keys = b.keySet();
		for (Integer k : keys) {
			System.out.println("Key is from = " + k + ": " + b.get(k));
		}
               
		
		System.out.println();
		
               
               
        System.out.println("==>how to get all keys 2nd way<==");
		System.out.println("--getting keys using iterator----");
		Iterator<Integer> kIt = keys.iterator();
		while (kIt.hasNext()) {
			int key = kIt.next();
			System.out.println(key);
			System.out.println("--create different format------");
			System.out.println("key is " + key + " its value is " + b.get(key));
		}
		
		
		
		System.out.println();
		
		System.out.println("---how to get all values using for each loop---");
		Collection<String> values = b.values();
		
		for(String v:values) {
			System.out.println("Value from collection: "+v);
		}
		
		System.out.println();
		
		System.out.println("---using all values using iterator---");
		Iterator<String> valuesIt= values.iterator();
		while(valuesIt.hasNext()) {
			System.out.println("Map values = "+valuesIt.next());
		}
 
	}

}
