package class28_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkyNum {

	public static void main(String[] args) {
		
			LinkedList<Integer> l = new LinkedList<>();

			for (int i = 50; i <=100; i++) {
				l.add(i);
			}

			Iterator<Integer> gul=l.iterator();
			while(gul.hasNext()) {
				if(gul.next()%3!=0) {
					gul.remove();
				}
			}
			
			System.out.println(l);
	}

}


