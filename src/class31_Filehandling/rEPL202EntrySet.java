package class31_Filehandling;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class rEPL202EntrySet {

	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");
		Set<Entry<String, String>> entry = map.entrySet();
		Iterator<Entry<String, String>> it = entry.iterator();
		while (it.hasNext()) {
			Entry<String, String> entr = it.next();
			String key = entr.getKey();
			String value = entr.getValue();
			System.out.println(key + " : " + value);
		}
		System.out.println("-------------------------");
		map.replace("THREE", "ASEL");
		map.replace("FIVE", "SUMAIR");
		
		Set<Entry<String, String>> entry1 = map.entrySet();
		Iterator<Entry<String, String>> it1 = entry.iterator();
		while (it1.hasNext()) {
			Entry<String, String> entr1 = it1.next();
			String key = entr1.getKey();
			String value = entr1.getValue();
			System.out.println(key + " : " + value);
		}
		        
	}

}
