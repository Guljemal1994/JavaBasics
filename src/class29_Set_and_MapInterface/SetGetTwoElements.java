package class29_Set_and_MapInterface;

import java.util.HashSet;
import java.util.Set;

public class SetGetTwoElements {

	public static void main(String[] args) {


		Set<Integer> set = new HashSet<>();
		  set.add(111);
		  set.add(111);
		  set.add(111);
		  set.add(999);
		  set.add(999);
		  set.add(999);
		  Object[] array = set.toArray();
		  System.out.println(array[0]);
		  System.out.println(array[1]);
		  
		  
		  
		
		
		
		
		
		
		
		
		
		

	}

}
