package class15_Methods_in_Java;

public class Google {
	int id;
	String name, lastName, title;
	double salary;
	void work() { System.out.println(title+" is working");}
	void getPaid() {System.out.println(name+" is getting paid "+salary);}
	void attendMeeting() {System.out.println(name+" attending meetings");}
	public static void main(String[] args) {
		// define features such as emp id, name, last name, title and salary
		// define a behavior: work, get paid, attending meetings
		Google emp1=new Google(); 
		emp1.id=27182;
		emp1.name="Paty";
		emp1.lastName="Gurbangeldiyeva";
		emp1.title="tester";
		emp1.salary=12304.3;
		emp1.work();
		emp1.getPaid();
		emp1.attendMeeting();
		
		System.out.println();
		Google emp2=new Google(); 
		emp2.id=3482;
		emp2.name="Vepa";
		emp2.lastName="Gurbangeldiyev";
		emp2.title="tester";
		emp2.salary=12304.3;
		emp2.work();
		emp2.getPaid();
		emp2.attendMeeting();
	}

		
		
		
	}
	
	

