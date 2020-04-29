package class30_Map_Intergace;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapKeys {

	public static void main(String[] args) {
		
		Map<String, String> key = new LinkedHashMap<>();
		
		key.put("1 item", "apple");
		key.put("2 item", "banana");
		key.put("3 item", "pear");
		key.put("4 item", "tomato");
		key.put("5 item", "mango");
		key.put("6 item", "kiwi");
		
		Set<Entry<String, String>> en = key.entrySet();
		
		for(Entry<String,String> s : en) {
			System.out.println("Key is "+s.getKey()+" and values is "+s.getValue());
		}
		

	}

}
