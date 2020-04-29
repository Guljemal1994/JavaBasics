package class30_Map_Intergace;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapRepl {

	public static void main(String[] args) {

		Map<String, String> jemka = new LinkedHashMap<>();

		jemka.put("Street", "Patrick ST");
		jemka.put("Suite", "265");
		jemka.put("city", "Vienna");
		jemka.put("Zip", "22180");
		jemka.put("Country", "United State");

		for(String str:jemka.values()) {
			System.out.println(str);
		}
		
	}

}
