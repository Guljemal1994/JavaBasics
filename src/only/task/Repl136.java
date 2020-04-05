package only.task;

public class Repl136 {

	String schoolName;
	int batch;
	int yaer;
	String lastDayOfClass;
	
	 Repl136(){
	 
	}
	Repl136(String schoolNamee, int batchh, int year, String lastDayOfClassy){
		schoolName=schoolNamee;
		batch = batchh;
		yaer = year;
		lastDayOfClass = lastDayOfClassy;
	}
   void display(){
         System.out.println(schoolName+" "+batch+" "+yaer+" "+lastDayOfClass);
}
  public static void main(String[] args){
    
    Repl136 obj = new Repl136();
    Repl136 obj1 = new Repl136("Syntax", 6 , 2020, "07/20/2020");
    obj.display();
    obj1.display();
   
}
}