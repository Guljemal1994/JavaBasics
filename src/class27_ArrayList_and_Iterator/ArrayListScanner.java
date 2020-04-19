package class27_ArrayList_and_Iterator;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScanner {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		for (int i=0;i<5;i++){
			a.add(scan.nextInt());
		}

		for (int num : a) {
			System.out.print(num + " ");
		}
		
		
		
	}
}
