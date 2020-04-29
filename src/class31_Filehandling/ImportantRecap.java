package class31_Filehandling;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ImportantRecap {

	public static void main(String[] args) {

		// lets create hashMap of counties with capitals

		Map<String, String> hmap = new HashMap<>();

		hmap.put("Usa", "Washington DC");
		hmap.put("Russia", "Moscow");
		hmap.put("France", "Paris");
		hmap.put("Italy", null);
		hmap.put(null, null);
		hmap.put(null, "jema");// we cannot have duplicate key
		System.out.println("HashMap ==> " + hmap);
		System.out.println();

		// how to get all keys from map?? keSet();--entrySet();
		System.out.println("how to get all keys from map??");
		Set<String> keys = hmap.keySet();// use loop or iterator to iterate over keys
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		System.out.println();

		System.out.println("--lets get both key and values----");
		Set<Entry<String, String>> en = hmap.entrySet();
		Iterator<Entry<String, String>> iter = en.iterator();// declaration
		while (iter.hasNext()) {
			Entry<String, String> entry = iter.next();
			String myEntry=entry.getKey()+"=="+entry.getValue();
			System.out.println(myEntry);
		}
		System.out.println();

		System.out.println("--how to get only values from map ? values(); entrySet();--");
		Collection<String> values = hmap.values();
		it = values.iterator();// reassign
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println();

		Map<String, String> htable = new Hashtable<>();
        htable.put("Usa", "Washington DC");
		htable.put("Russia", "Moscow");
		htable.put("France", "Paris");
		// htable.put("Italy", null);--> we cannot store null values inside hashtable
		// htable.put(null, "jema");--> we cannot store null keys inside hashtable
		System.out.println("HashTable ==> " + htable);

	}

	public static Map<String, String> createMap(String key, String value) {

		Map map = new HashMap<>();
		map.put(key, value);

		return map;
	}

}
