package class27_ArrayList_and_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAndIterator {

	public static void main(String[] args) {

		System.out.println("**lets create an ArrayList of chocolate**");
		ArrayList<String> ch = new ArrayList<>();
		ch.add("Kinder");
		ch.add("godiva");
		ch.add("hershey");
		System.out.println();

		System.out.println("--create arrayList of sweets--");
		ArrayList<String> sw = new ArrayList<>();
		sw.add("banana cake");
		sw.add("cheese cake");
		sw.addAll(ch);
		System.out.println(sw.size());// 5
		System.out.println(sw);

		System.out.println();

		System.out.println("--we want to iterate thtough the collection---");
		Iterator<String> it = sw.iterator();

		// iteritor in 1 direction
		if (it.hasNext()) {// banana cake//if we checks once only grabs one elemet
			String element = it.next();
			System.out.println(element);// banana cake
		}

		System.out.println();

		while (it.hasNext()) {// while etsen ayry ayry cykaryar
			String elements = it.next();
             if(elements.equals("banana cake")) {
            	 it.remove();
             }

		}
		System.out.println("Arraylist after removing ekement ");
		System.out.println(sw);
		
		System.out.println();
		System.out.println("--How to get elemente backwords---");
		
		for(int i=sw.size()-1; i>=0; i-- ) {
			System.out.print(sw.get(i)+"; ");
		}
		System.out.println();
	
		
		System.out.println();
		System.out.println("===advance for loop/iterates/loops in 1 dirction===");
		for(String srt: sw) {
			System.out.println(srt);
		}
		
		
		
		
		
		
	}

}
