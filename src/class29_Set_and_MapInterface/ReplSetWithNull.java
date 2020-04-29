package class29_Set_and_MapInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReplSetWithNull {

	
	public static void main(String[] args) {
		
		Set<String> name = new LinkedHashSet<>();
		name.add(null);
		name.add("Sohil ");
		name.add("Diego");
		name.add("Alijon");
		name.add("Asel");
		name.add("Sumair");
		for(String str: name) {
			System.out.println(str);
		}
		
		Iterator<String> names = name.iterator();
		while(names.hasNext()) {
			System.out.println(names.next());
		}
		
		
		
		
		
		
		
		 
		
		
		
		
		
		
		
		
		

	}

}
