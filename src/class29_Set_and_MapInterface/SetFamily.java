package class29_Set_and_MapInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {

		System.out.println("==>LinkedHashSet<==");
		Set<String> veg = new LinkedHashSet<>();// [Carrot, Potato, Cocumber, Avocado]
		veg.add("Carrot");
		veg.add("Potato");
		veg.add("Cocumber");
		veg.add("Avocado");
		veg.add("Potato");
		veg.add("Cocumber");
		System.out.println(veg);
		System.out.println(veg.size());

		System.out.println("---------------------------------------------");
        
		System.out.println("==>HashSet<==");
		Set<String> veg1 = new HashSet<>();// [Potato, Carrot, Cocumber, Avocado]
		veg1.add("Carrot");
		veg1.add("Potato");
		veg1.add("Cocumber");
		veg1.add("Avocado");
		veg1.add("P");
		veg1.add("Co");
		System.out.println(veg1);
		System.out.println(veg1.size());

		System.out.println("*************************************************");

		System.out.println("===>TreeSet<===");
		Set<String> veg2 = new TreeSet<>();// [Avocado, Carrot, Cocumber, Potato]
		veg2.add("Carrot");
		veg2.add("Potato");
		veg2.add("Cocumber");
		veg2.add("Avocado");
		veg2.add("Po");
		veg2.add("Coc");
		System.out.println(veg2);
		System.out.println(veg2.size());
		
		System.out.println();
		
		System.out.println("-->Tree stores objects in ascending order<--");
		Set<String> food=new TreeSet<>(veg);//object of collection
		food.addAll(veg1);
		food.addAll(veg2);
		System.out.println(food);
		
	}

}
