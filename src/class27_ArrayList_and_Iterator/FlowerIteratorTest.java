package class27_ArrayList_and_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerIteratorTest {

	public static void main(String[] args) {

		// flowers into Array
		/*
		 * 1. hw to call available methods using: for loop, advanced for loop,iterator
		 */
FlowerIterator[] flar = { new Tulip("Tulip"), new Rose("Rose"), new SunFlower("Sun Flower") };

		// store flowers into arraylist
		ArrayList<FlowerIterator> fl = new ArrayList<>();
		fl.add(new Tulip("Tulip"));
		fl.add(new Rose("Rose"));
		fl.add(new SunFlower("Sun Flower"));

		System.out.println("==>for lopp<===");
		for (int i = 0; i < fl.size(); i++) {
			fl.get(i).bloom();
		}
		System.out.println();

		System.out.println("==>advanced for loop<==");
		for (FlowerIterator f : fl) {
			f.bloom();
		}
		System.out.println();

		System.out.println("==>iterator<==");
		Iterator<FlowerIterator> gul = fl.iterator();
		while (gul.hasNext()) {
			FlowerIterator gulm = gul.next();
			gulm.bloom();
		}
	
	
	
	}

}
