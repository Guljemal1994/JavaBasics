package class27_ArrayList_and_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Task4 {
public static void main(String[] args) {
	
		/*
		 * Create an arrayList of even numbers from 1 to 50. Using Iterator remove any
		 * number that is divisible by 5 from that arrayList.
		 */
	
	ArrayList<Integer> num = new ArrayList<>();
	
	for(int i=0; i<50; i++) {
		if(i%2==0) {
			num.add(i);
		}
	}
	System.out.println("arrayList of even numbers from 1 to 50= "+num);
	
	Iterator<Integer> n = num.iterator(); 
	while (n.hasNext()) {
		if(n.next()%5==0) {
			n.remove();
		}
	}
	System.out.print(num);
	
	
}
}
