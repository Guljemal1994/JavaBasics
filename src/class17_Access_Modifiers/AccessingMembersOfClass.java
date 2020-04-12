package class17_Access_Modifiers;

public class AccessingMembersOfClass {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name = "Ben";
		emp.lastName = "Kuly";
		emp.salary = 10000;
		//emp.ssn = 326541;CE: error field ssn is not visiable sebabi privvate
		
		Employee.method1();//public 
		emp.method2();//protected
		emp.method3();//default
		//emp.method4();//CE: error is not visiable
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
