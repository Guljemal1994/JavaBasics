package class31_Filehandling;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repl201 {

	public static void main(String[] args) {
		
		Map<String, String> mmap = new HashMap<>();
        mmap.put("Street", "Patrick ST");
        mmap.put("Suite", "265");
        mmap.put("City", "Vienna");
        mmap.put("Zip", "22180");
        mmap.put("Country", "United State");
        Set<Entry<String, String>> entry = mmap.entrySet();
        Iterator<Entry<String, String>> it = entry.iterator();
        while (it.hasNext()) {
            Entry<String, String> ent = it.next();
            String value = ent.getValue();
            System.out.println(value.toUpperCase());
        }
        
        Map<String, String> jemka = new HashMap<>();

		jemka.put("Street", "Patrick ST");
		jemka.put("Suite", "265");
		jemka.put("city", "Vienna");
		jemka.put("Zip", "22180");
		jemka.put("city", "Vienna");
		jemka.put("Country", "United State");
   
   Set<Entry<String,String>> en = jemka.entrySet();
		for (Entry<String, String> e : en) {
			System.out.println( e.getValue());
		}
		


	}

}
