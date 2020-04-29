package class31_Filehandling;

import java.util.*;
import java.util.Map.*;

public class repl205 {

	public static void main(String[] args) {
		// Step-1
		List<Map<String, Object>> dataList = new ArrayList<>();
		// Step-2
		Map<String, Object> appleMap = new LinkedHashMap<>();
		appleMap.put("Items", "Apple");
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10);
		// Step 3: Add appleMap to dataList.
		dataList.add(appleMap);
		// Step 4: Create orangeMap<String, Object> and add below pairs into it.
		Map<String, Object> orangeMap = new LinkedHashMap<>();
		orangeMap.put("Items", "Orange");
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10);
		// Step 5: Add orangeMap to dataList.
		dataList.add(orangeMap);
		// Step 6: Create a loop from dataList.
		double totalPurchase = 0.0;
		for (Map<String, Object> key : dataList) {

			// Step 8: calculate the subtotal of each object.
			double price = (double) (key.get("Price"));
			double quantity = (int) (key.get("Quantity"));
			double subtotal = (price * quantity);
			// Step 9: Print the values of each Iteration same as shown below in Output
			// example.
			System.out.println("Items:" + key.get("Items") + " Price: " + price + " Quantity: " + quantity
					+ " SubTotal: " + subtotal);
			// Step 10: Calculate the Sum of subtotal. and store is in variable called
			// totalPurchase.
			totalPurchase += subtotal;
		}
		// Step 11: After Loop Print the value of Total Purchase.
		System.out.println("Your Purchase total :" + totalPurchase);
	}
}








































