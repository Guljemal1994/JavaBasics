package class29_Set_and_MapInterface;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		// HashMap is not maintain order
		HashMap<String, String> map = new HashMap<>();
		// how to store value into Map we use put
		map.putIfAbsent("Name", " Guljemal");
		map.put("LastName", " Mert");
		map.put("Adress", " DoogWood DR");
		map.put("City ", " Dallas");

		// how to check if map has any values
		boolean is = map.isEmpty();
		System.out.println("Map is empty-->" + is);// false

		// how many elements is Map
		int size = map.size();
		System.out.println("Map size is---> " + size);// 4

		// can we add more values into Map
		map.put("Zip ", " 12177");

		// can we store duplicate keys??No privius value will be replaces
		// map.put("Name ", " Gul");
		System.out.println(map);

		// how can i access the value?- use method get and specify the key
		System.out.println(map.get("Name"));

		// remove value
		map.remove("Adress");
		System.out.println(map);

		System.out.println("------------");
		//replace value in map
		map.replace("Zip ", "76798");
		System.out.println(map);
		
		
		
		
	}

}
