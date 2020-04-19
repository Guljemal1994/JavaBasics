package class29_Set_and_MapInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InsuranceTestWithHashSet {

	public static void main(String[] args) {

		HashSet<Insurance> hset = new HashSet<>();
		hset.add(new Car("Geico", "BMW"));
		hset.add(new Pet("Prograssive", "Dog"));
		hset.add(new Health("BCBS"));
		System.out.println(hset.size());// 3

		Iterator<Insurance> hs = hset.iterator();
		while (hs.hasNext()) {
			Insurance s = hs.next();
			s.getQuote();
			s.cancelInsuranse();
			s.method();
			System.out.println("--------------------------");

		}
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

		Set<Insurance> hse = new HashSet<>();
		hse.add(new Car("Geico", "BMW"));
		hse.add(new Pet("Prograssive", "Dog"));
		hse.add(new Health("BCBS"));
		System.out.println(hse.size());// 3

		Iterator<Insurance> h = hse.iterator();
		while (hs.hasNext()) {
			Insurance in = h.next();
			in.getQuote();
			in.cancelInsuranse();
			in.method();
			//in.display();// won't be avaiable to insurance
			System.out.println("--------------------------");

		}
		
		
		
		
		
	}

}
