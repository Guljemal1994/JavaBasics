package class30_Map_Intergace;

import java.util.HashMap;
import java.util.Map;

public class HardRepl204 {

	public static void display(Map<String, Integer> map)  {
	       if (map.isEmpty()){
	            System.out.println("map is empty");
	        }else{
	            for (String keys : map.keySet()) {
	              System.out.println (keys + " : " + map.get(keys));
	            }
	        }
	     }
	  public static void main(String[] args) {
	   Map<String, Integer> map = new HashMap<>();
	        map.put("mango", 10);
	        map.put("apple", 30);
	        map.put("orange", 20);
	     display(map);
	     map.clear();
	     display(map);
	  }
}
