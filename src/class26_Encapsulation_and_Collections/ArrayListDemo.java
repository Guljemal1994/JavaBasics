package class26_Encapsulation_and_Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//create ArrayList with names
		
		ArrayList<String> arrayList = new ArrayList<>();//object of the ArrayList
		
		//string object into array
		arrayList.add("Jemka");
		arrayList.add("Maral");
		
		//access elements from array
		String fistElement = arrayList.get(0);
		System.out.println(fistElement);
		
		//array is dynamic array
		arrayList.add("Konul");
		arrayList.add("Gonul");// no add limit
		
		//how to get number of elements inside array ?
		int size = arrayList.size();
		System.out.println(size);//4
		
		arrayList.add("julia");
		System.out.println(arrayList.size());//5
		
		arrayList.remove("Gonul");
		System.out.println(arrayList.size());//Gonul ayyranymyz un 4 
		
		System.out.println(arrayList);//[Jemka, Maral, Konul, julia]
		
		arrayList.set(1, "Julia");//set yerlerini uygetmek un ulanylyar
		System.out.println(arrayList);//[Jemka, Julia, Konul, julia]
		
		
		//how to retrive values from  arraylist 1by 1
		
		System.out.println("-------regular loop-------------------");
		for(int i=0; i<arrayList.size(); i++) {
			String element = arrayList.get(i);
			System.out.println(element);
		}
		
		System.out.println("----------enhanced for loops----------");
		for(String str:arrayList) {
			System.out.println(str);
		}
		
		
		
		
		
	}

}
