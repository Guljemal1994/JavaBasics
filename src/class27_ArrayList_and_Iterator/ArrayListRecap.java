package class27_ArrayList_and_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListRecap {

	public static void main(String[] args) {
		
		System.out.println("******Generic Collection*******");
		// lets create arrayList that stores Double type of objects
		// 1. generic collection / arrayList
		ArrayList<Double> list = new ArrayList<>();
		list.add(10.99);
		list.add(10.3);
		list.add(12.90);
		list.add(12.2);
		// list.add((100);int
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.clone());

		System.out.println();

		System.out.println("--set yerlerini calysmak ucin----");
		list.set(1, 12.2);
		System.out.println(list);

		System.out.println();

		System.out.println("-->remove elements<--");
		list.remove(10.99);
		System.out.println(list);

		System.out.println();

		System.out.println("-->retrive single elements<--");
		System.out.println(list.get(1));

		System.out.println();

		System.out.println("-->1st way...retrive all elements from collection/use advanced / enhanced for loop<--");
		for (double a : list) {
			System.out.println(a);
		}
		System.out.println();

		System.out.println("2nd way......---for loop");
		for (int i = 0; i < list.size(); i++) {// in the collection we use size
			double d = list.get(i);
			System.out.println(d);
		}

		System.out.println();

		System.out.println("--Iterator----");
		Iterator<Double> iterator = list.iterator();
		while (iterator.hasNext()) {
			double g = iterator.next();
			System.out.println(g);
		}

		System.out.println();
		System.out.println("----Non generic collection/arraylist-----------");

		ArrayList obj = new ArrayList();
		obj.add("hahah");// different type of obj
		obj.add(100);
		obj.add('c');
		obj.add(false);
		obj.addAll(list);// store collection object
		System.out.println(obj);

		System.out.println("--retrive all elements from collection----");
		for (Object o : obj) {
			System.out.println(o);
		}

	}
}
