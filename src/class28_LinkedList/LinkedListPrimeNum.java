package class28_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LinkedListPrimeNum {

	public static void main(String[] args) {
		
		List<Integer> pNum = new LinkedList<>();
		for (int i = 2; i <100; i++) {
			if (isPrime(i)) {
				pNum.add(i);
			}
		}

		System.out.println(pNum);
	}

	public static  boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}