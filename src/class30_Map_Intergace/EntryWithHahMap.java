package class30_Map_Intergace;


import java.util.HashMap;
import java.util.Map; 
import java.util.Map.Entry;
import java.util.Set;


public class EntryWithHahMap {

	public static void main(String[] args) {
		
		Map<String, String> jemka = new HashMap<>();

		jemka.put("Street", "Patrick ST");
		jemka.put("Suite", "265");
		jemka.put("city", "Vienna");
		jemka.put("Zip", "22180");
		jemka.put("Country", "United State");

		Set<Entry<String,String>> en = jemka.entrySet();
		for (Entry<String, String> e : en) {
			System.out.println( e.getValue());
		}

		
	}

}
