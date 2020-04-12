package class20_SuperKeyword;

public class TestClass {

	public static void main(String[] args) {
		
		Employe emp=new Employe();
		emp.empNumber=101;
		emp.salary=90000;
		emp.getPaid();
		Employe.company="ABC";
		Employe.getWork();
		System.out.println("-------------------------------------");
		ProductOwner po = new ProductOwner();
		//features accessible from grand parent
		//po.empNumber=123;
		po.salary=150000;
		//po.ssn --> CE: private members of the class not available 
		//--> DO NOT PARTICIPATE I INHERITANCE
		ProductOwner.company="Syntax";
		//features accessible from immediate parent
		po.ceremonies="Sprint Grooming, Sprint Planning, Sprint Demo, Daily Stand up";
		po.attendMeetings();
		//accessing own features
		po.prioritizeBacklog();

		ProductOwner.getWork();
		Employe.getWork();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
