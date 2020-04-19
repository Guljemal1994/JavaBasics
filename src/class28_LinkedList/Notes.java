package class28_LinkedList;

public class Notes {
	/*
	 * Why do we need collections?
	 * 
	 * The Java collections framework gives the programmer access to prepackaged
	 * data structures as well as to algorithms for manipulating them. A collection
	 * is an object that can hold references to other objects. The collection
	 * interfaces declare the operations that can be performed on each type of
	 * collection.
	 * 
	 * 
	 * Collectoin is container object Inside collection we can store objects We can
	 * store object of predefined classes: String, Integar, Long , Double, Boolean
	 * etc. Also we can store objects of usres define classes:Flower,Car,Student.
	 * 
	 * 
	 * 3Interfaces that extends collection Interface: List - ordered collection that
	 * aloows duplicates Set - Queue
	 * 
	 * Iterator is used ri iterator obj/elements in all collections it has 3
	 * methods: 1.boolean hasNext(); 
	 *          2.objcet next(): 3.void remove();
	 * 
	 * Anytime we want to remove an objcet from collection USE iterator..
	 * 
	 * **********************************************************************************
	 * What is the difference Array vs ArraList????? ------->Array is a static data structor
	 * vs ArrayList is a dynamic data structure.
	 * First and Major difference between
	 * Array and ArrayList in Java is that Array is a fixed length data structure
	 * while ArrayList is a variable length Collection class. You can not change
	 * length of Array once created in Java but ArrayList re-size itself when gets
	 * full depending upon capacity and load factor.
	 * 
	 *    1.Array is a static data structor vs ArrayList is a dynamic data structure.
	 * 
	 *    2. Array does not have ready methods to manipulate with data while ArrayList is collection 
	 * class and it has methods such as add();,remove();, replace();, etc....
	 * 
	 *  3. ArrayList Can not store primitives , Array Can store Primitives and object
	 *  
	 *  --------------------------------------------------------------------------------------------
	 *  LINKEDLIST------>class that implements list Interface and stores elements in a from of doubly list.
	 *  Allows efficient insertion and removal of element in the middle of the list
	 *  
	 *  
	 *  What is the difference LinkedList vs arraylist?
	 *   
	 *   1)ArrayList internally uses a dynamic array to store the elements. 
	 *   LinkedList internally uses a doubly linked list to store the elements. 
	 *   2) Manipulation with ArrayList is slow because it internally uses an array.
	 *    If any element is removed from the array, all the bits are shifted in memory.
	 * 
	 */
}
