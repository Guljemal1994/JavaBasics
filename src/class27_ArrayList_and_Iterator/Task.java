package class27_ArrayList_and_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {

	public static void main(String[] args) {
	
		//Create an arrayList of words. Remove every word that ends with “e”. Use iterator		
		
		ArrayList<String> wr = new ArrayList<>();
		wr.add("Hello");
		wr.add("Salame");
		wr.add("Privet");
		wr.add("Merhaba");
		
		Iterator<String>  wr1 =wr.iterator() ;
		while(wr1.hasNext()) {
			if(wr1.next().endsWith("e")) {
				wr1.remove();
			}
		}
		System.out.println(wr);
		
		
		
		
		
		
	}

}
