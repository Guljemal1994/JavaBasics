package class28_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedRemoveSomeElements {


	static List<String> rE(List<String> list, String letter) {

			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				if (it.next().startsWith(letter)) {
					it.remove();
				}
			}

			return list;
		}

		public static void main(String[] args) {

			List<String> countries = new LinkedList<>();
			countries.add("Armenia");
			countries.add("USA");
			countries.add("Kazakhstan");
			countries.add("Australia");
			countries.add("Pakistan");
			countries.add("Russia");
			countries.add("Azerbaijan");

			System.out.println(rE(countries, "A"));
		
		
		
		
		

	}

}
