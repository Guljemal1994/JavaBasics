package class29_Set_and_MapInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	private String fullName;
	private long ssn;
	private double salary;
	
	Main(String fullName, long ssn, double salary){
		this.fullName = fullName;
		this.ssn = ssn;
		this.salary = salary;
	}
	public String getName() {
		return fullName;
	}
	public long ssn() {
		return ssn;
	}
	public double salary() {
		return salary;
	}
	
	public static void main(String[] args) {
		
		Set<Main> set = new LinkedHashSet<>();
		set.add(new Main("John Doe", 123456789, 80000.0));
		set.add(new Main("Jane Smith", 987654321, 90000.0));
		set.add(new Main("Jackie Can", 0, 1000000.0));
		
		Iterator<Main> it = set.iterator();
		while (it.hasNext()) {
			Main m = it.next();
			System.out.println(m.fullName);
			System.out.println(m.ssn);
			System.out.println(m.salary);
		}
	}
}
