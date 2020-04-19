package class28_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Jem");//somes from collection
		list.add(0, "Ben");//comes from list
		list.add("Maa");
		list.add("Gonul");
		int k = list.size();
		System.out.println(k);//4
		
		
		//get all elements 1 by 1 3 different way
		
		System.out.println("---Regular loop----");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---enhanced for loops---------");
		for (String l:list) {
			System.out.println(l);
		}
		
		System.out.println("---Iterator---");
		
		Iterator<String> it =  list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		} 
		
		
		
		
		
		
	}
}
