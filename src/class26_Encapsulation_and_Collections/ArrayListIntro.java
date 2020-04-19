package class26_Encapsulation_and_Collections;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		ArrayList<Integer>num= new ArrayList<>();
		num.add(10);
		num.add(11);
		num.add(12);
		num.add(13);
		num.add(14);
		System.out.println(num.get(3));
		System.out.println(num.contains(13));
		
		System.out.println();
		
		System.out.println("----regular loop------");
		for(int i=0; i<num.size(); i++ ) {
			Integer numm = num.get(i);//autounboxing
			System.out.println(numm);
		}
		
		System.out.println("***********************");
		for(Integer nummm:num) {
			System.out.println(nummm);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
