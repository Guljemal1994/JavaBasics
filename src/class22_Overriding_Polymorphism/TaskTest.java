package class22_Overriding_Polymorphism;

public class TaskTest {

	public static void main(String[] args) {
		
		StudentTask st = new StudentTask();
		st.study();
		st.learn();
		st.getJob();
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
	  
		CollageStudents cs = new CollageStudents();
		cs.study();
		cs.life();
		cs.essay();
		System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
		
		SchoolStudens ss = new SchoolStudens();
		ss.study();
		ss.listen(); 
		
	}

}
