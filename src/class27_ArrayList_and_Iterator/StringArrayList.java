package class27_ArrayList_and_Iterator;

import java.util.ArrayList;

public class StringArrayList {

	public static void main(String[] args) {
		

		ArrayList<String> words = new ArrayList<>();
		words.add("hi");
		words.add("yo");
		words.add("sup");
		words.add("yolo");
		words.add("boop");
		words.remove(0);
		words.remove(1);
		words.remove(2);
		for (String w : words) {
			System.out.print(w + " ");
		}
	}

}
