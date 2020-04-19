package class26_Encapsulation_and_Collections;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		/*
		 * Create a generic ArrayList that will store 5 names into it. Find out whether
		 * the given ArrayList is empty or not? Check whether the specific name is
		 * present in an ArrayList or not? Find the size of your arrayList and print all
		 * values from that
		 */

		ArrayList<String> gul = new ArrayList<>();
		gul.add("Amanda");
		gul.add("Neko");
		gul.add("Ware");
		gul.add("Trifa");
		gul.add("Sara");

		System.out.println("---->"+gul.isEmpty());// false
		
		System.out.println("====>"+gul.contains("Sara"));// true
       
		System.out.println("===>"+gul.contains("Julia"));//false
		
		System.out.println("size:"+gul.size());// 5
		
		for (String mert : gul) {
			System.out.println(mert);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
