package class29_Set_and_MapInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student{
	
	private String studentName;
	private int studentId;
	
	public  Student (String studentName, int studentId) {
		this.studentName = studentName;
		this.studentId = studentId;
	}

	public String getName() {
		return studentName;
	}
	public int getId() {
		return studentId;
	}
	
}

public class Task3{
	public static void main(String[] args) {
		
		Set<Student> st = new HashSet<>();
		st.add(new Student("Jema",107));
		st.add(new Student("Ben",111));
		st.add(new Student("Kon",160));
		st.add(new Student("Goz",109));
		st.add(new Student("Toy",110));
		st.add(new Student("Sal",170));
		
		Iterator<Student> stu = st.iterator();
		while(stu.hasNext()) {
			System.out.println(stu.next().getName()+" --> "+stu.next().getId());
		}
		
		
		
	}
}
