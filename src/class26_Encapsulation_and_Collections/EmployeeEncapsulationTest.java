package class26_Encapsulation_and_Collections;

public class EmployeeEncapsulationTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("Jemka");//eger 3 harpdan az bolsa null cykaryar
		System.out.println(emp.getName());
		
		emp.setAge(22);
		System.out.println(emp.getAge());
		
		emp.setSalary(40000);
		System.out.println(emp.getSalary());
		
		
		
	}

}
