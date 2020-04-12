package class15_Methods_in_Java;

public class PracticeGrade {

	char grade (int a) {
		char grades;
		if(a>90) {
			grades = 'A';
		}else if(a<=90 && a>80) {
			grades = 'B';
		}else if(a<=80 && a>70) {
			grades = 'C';
		}else {
			grades = 'F';
		}
            return grades;
    	}
	
	public static void main(String[] args) {
		PracticeGrade obj = new PracticeGrade();
		 char gradess = obj.grade(98);
		 System.out.println(gradess);
		 System.out.println(obj.grade(81));//2 grade birlikde cykarjak bolsak
		 //equals method work only with String
		 
		 if (gradess=='A' || gradess=='B') {
			 System.out.println("Good job");
		 }else {
			 System.out.println("Study more");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
