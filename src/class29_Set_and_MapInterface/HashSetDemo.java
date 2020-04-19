package class29_Set_and_MapInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//create collection that will store only unique objects and we do naot care about order
		
		HashSet<String> breakfast = new HashSet<>();
		breakfast.add("bread");
		breakfast.add("tea");
		breakfast.add("Cream Chese");
		breakfast.add("eggs");
		breakfast.add("coffee");
		breakfast.add("eggs");//bs 2 eggs we have
		//many elements
		int size  = breakfast.size();//5
		System.out.println(size);
		
		//order is not maintained
		System.out.println(breakfast);
		
		//we need to retrieve an element--no get methods avaiable
		
		System.out.println("===>we can retieve all elements with Iterator<===");
	   Iterator<String> myit = breakfast.iterator();
		while(myit.hasNext()) {
			String s = myit.next();
			System.out.println(s);// 1 way get our values 1 by 1 
			//System.out.println(myit.next());//2 way get our values 1 by 1 
		}
		System.out.println();
		
//		System.out.println("===retieve all elements with  regular for loop===");
//		for(int i=0; i<breakfast.size(); i++) {
//			breakfast.
//		} WE CANNOT USE FOR LOOP 
//		
		
		
		System.out.println("===>retieve all elements with advanced/enhands/each for loop<===");
		for(String br: breakfast) {
			System.out.println(br); 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
