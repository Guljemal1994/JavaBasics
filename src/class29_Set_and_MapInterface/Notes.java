package class29_Set_and_MapInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class Notes {
	/*
	 * Differenses : ArrayList - is good and fast for retriving elements LinkedList
	 * - is for manipulition and removing elements
	 * 
	 * 
	 * Similarities: Both implements List interface , it means the both ordred
	 * collections that allow and store elements base on indexes
	 * 
	 * 
	 * ArrayList and Array: Similarities--> both can hold multiple values , both can
	 * can objects.
	 * 
	 * 
	 * Differenses: Array is a static data structor vs ArrayList is dynamic ds.
	 * Array can store primitive while Arraylist cannot. Array does not have ready
	 * methods while Arralist does.
	 * 
	 * 
	 * 
	 * Set Collection / Interface - is Collection that can only contain unique
	 * elements. The set interface contains only methods inherited from Collection
	 * and adds the restriction that duplicate elements are prohibited
	 * 
	 *
	 * 3 main implementations of set interface: 1.HashSet==>Does not gaurrantee any
	 * insertion order and allows nul elements. 2.LinkedHashSet===> follows
	 * insertion order of the element. 3.TreeSet====>follows ascending sorting order
	 * of the element no matter how they are added.
	 *
	 * Set<String> veg = new LinkedHashSet<>();
	 * veg.add("Carrot"); 
	 * veg.add("Potato"); 
	 * veg.add("Cocumber");
	 * veg.add("Avocado"); 
	 * veg.add("Potato"); 
	 * veg.add("Cocumber");
	 * LinkedHashSet<>();->output:[Carrot, Potato, Cocumber, Avocado]//yerbe yer cykarmak ucin LinkedHastSet ulanmaly
	 * HashSet<>();---->OutPut: [Potato, Carrot, Cocumber, Avocado]//heryerden cykarjak bolsanam HashSet
	 * TreeSet<>();-->OutPut:
	 * 
	 * List vs Set?
	 * List is an ordered collection that has duplicates elements/objects while set does not allow duplicates 
	 * List has 3 implementation classess: ArrayList , LinkedList , Vector;
	 * Set has 3 implementation classess: HashSet, LinkedHashSet, TreeSet;
	 * 
	 * In the Set --> get methos is not available; 
	 * 
	 * How to remove duplicate elements --> convert to set 
	 * How to retrieve single elements from set-->convert to list
	 * 
	 * 
	 * array is a utility class that have mothods to work with aarrays --> Arrays.sort(array);
	 * 
	 * to sort elements of any collection
	 * collections is a utility calss that have methods to work with collections --> Collections.sort(list);
	 * 
	 * --------------------------------------------------------------------------------------------------
	 * 
	 * Map--> is an object tht stores group of objects as key an value pair;
	 * key+value= Entry
	 * Map is collection on entry objects
	 * 
	 * Map is not a collection !!!!!!!!!!!!!!!!
	 * 
	 * Map is an iterface. 
	 * 
	 *  Map has 4 implementstion method
	 *   1.HashMap
	 *   2.LinkedHashMap
	 *   3.TreeMap
	 *   4.HashTable
	 *   
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
