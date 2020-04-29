package class30_Map_Intergace;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		
		//create a map that will store month and days in a month
		
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put("January", 31);// = entry
		map.put("February", 28);
		map.put("March", 31);
		map.put("April", 30);
		System.out.println(map.size());// gives number of entries
		System.out.println(map);

		System.out.println("--get all entries from map--");
		Set<Entry<String, Integer>> en = map.entrySet();
		// loop through all entry objects
		for (Entry<String, Integer> e : en) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}

		System.out.println("---using iterator----");
		// iterate through all entry objects
		Iterator<Entry<String, Integer>> it = en.iterator();
		while (it.hasNext()) {
			// System.out.println("Keys+ "+it.next().getKey()+"; values=
			// "+it.next().getValue());

			Entry<String, Integer> ent = it.next();
			System.out.println(ent.getKey() + " == " + ent.getValue());

			// System.out.println("===for print single entry===");
			// System.out.println(ent);

		}

	}

}
