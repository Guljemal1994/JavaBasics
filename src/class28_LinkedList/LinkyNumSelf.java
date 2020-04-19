package class28_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkyNumSelf {

	public static void main(String[] args) {
		
		LinkedList<Integer> num = new LinkedList<>();
		for(int i=20; i<60; i++) {
			num.add(i);
		}
		Iterator<Integer> num1 = num.iterator();
		while (num1.hasNext()) {
			if(num1.next()%2==0) {
				num1.remove();
			}
		}
		
		System.out.println(num);
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
