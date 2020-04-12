package class15_Methods_in_Java;

public class CreatingMethods {
        
	//we want create Method that will  accept mark(90,80)
		//based on the marks it will return grade (A,B,C)
		//if Grade >90-->A if 90<grade>80-->B, if 80<>70-->C

		char getGrade (int a) {
			char grade;
			if(a>90) {
				grade = 'A';
			}else if(a<=90 && a>80) {
				grade = 'B';
			}else if(a<80 && a>70) {
				grade = 'C';
			}else {
				grade = 'F';
			}
			return grade;
		}
		
  public static void main(String[] args) {
	
	  CreatingMethods obj = new CreatingMethods();
	char grade = obj.getGrade(70);//sun icindki sanlary uytgetsen sona gora cykaryar garde
	  System.out.println(grade);
	  
	 System.out.println(obj.getGrade(60));//2 grade birlikde cykarjak bolsak
			 //equals method work only with String
			 
			 if (grade=='A' || grade=='B') { 
				 System.out.println("Good ");
			 }else {
				 System.out.println("Study hardly");
			 }
	  
}	
		
		
		
		
		
		
		
		

	}


