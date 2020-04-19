package class29_Set_and_MapInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		
		Set<String> coun = new LinkedHashSet<>();
		coun.add("Australia");
		coun.add("Belarus");
		coun.add("Canada");
		coun.add("French");
		coun.add("Uruguay");
		coun.add("Turkmenistan");
		coun.add("Ukraine");
		
		System.out.println(coun);
		
		Iterator<String> c = coun.iterator();
		while (c.hasNext()) {
			if(c.next().toLowerCase().startsWith("a")) 
				c.remove();
			}
		 System.out.println(coun);
		
		
		
		
		
		
		
		

	}

}
