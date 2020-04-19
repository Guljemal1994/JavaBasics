package class29_Set_and_MapInterface;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		
		Set<String> c = new TreeSet<>();
		c.add("Dallas");
		c.add("Arlington");
		c.add("Austin");
		c.add("Houston");
		c.add("Miami");
		c.add("Florida");
		 
		for(String con: c) {
			System.out.println(con);
		}
		
		System.out.println("--------------------------");
		Iterator<String> cities = c.iterator();
		while(cities.hasNext()) {
			System.out.println(cities.next()+" ");
		}

	}

}
