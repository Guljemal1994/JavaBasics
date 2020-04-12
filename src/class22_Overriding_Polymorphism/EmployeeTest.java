package class22_Overriding_Polymorphism;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.salary = 8000;
		emp.getPaid();
		
		FullTimeEmployee ft = new FullTimeEmployee();
		ft.salary = 55000;
		ft.getPaid();
		
		PartTime pt = new PartTime();
		pt.salary = 60000;
		pt.getPaid();
		
		Constructor ct = new Constructor();
		ct.houlyRate = 50;
		ct.getPaid();
		
		
	}
}
