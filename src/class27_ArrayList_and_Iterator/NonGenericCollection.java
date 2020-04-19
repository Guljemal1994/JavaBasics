package class27_ArrayList_and_Iterator;

import java.util.ArrayList;

public class NonGenericCollection {

	public static void main(String[] args) {
		System.out.println("----Non generic collection-----------");
		//2. non generic collection/arraylist
		ArrayList obj = new ArrayList();
		obj.add("hahah");//different type of obj
		obj.add(100);
		obj.add('c');
		obj.add(false);
		//obj.addAll(list);//store collection object
		System.out.println(obj);
		
		//retrive all elements from collection
			for(Object o:obj) {
				System.out.println(o);
			}
		

	}

}
