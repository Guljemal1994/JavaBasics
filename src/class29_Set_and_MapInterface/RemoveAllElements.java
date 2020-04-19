package class29_Set_and_MapInterface;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveAllElements {

	public static void main(String[] args) {
		
		//how can you remove all duplicates from ArrayList
		
		ArrayList<String> name = new ArrayList<>();
		name.add("Enes");
		name.add("Gussi");
		name.add("Anna");
		name.add("Enes");
		name.add("Gussi");
		name.add("Jema");
		
		Set<String> set = new LinkedHashSet<>(name);
		set.addAll(name);
		System.out.println(set);
		set.add("Nazik");
		set.add("Wepa");
		//how to get only one value from set?
		if(set.contains("Enes")){
			System.out.println("We have Enes");
		}
		//1 way we can convert to list
		List<String> lt = new ArrayList<>(set);
		String n = lt.get(4);
		System.out.println(n);
		lt.add("gul");
		lt.add("gul");
		lt.add("gul");
		System.out.println(lt);
		
		System.out.println("*******************************************");
		//2.way convert to array
		Object[] array = set.toArray();
		System.out.println(array[5]);
		
		
		//to sort elements of any collection
		System.out.println("-------to sort elements of any collection---------");
		Collections.sort(lt);
		System.out.println(lt);
		
		
		
		
		
		
		
		
	}
}
