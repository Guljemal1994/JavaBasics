package class26_Encapsulation_and_Collections;

public class Task2Test {
	public static void main(String[] args) {
		
		Task2 ts = new StudentA(88,66,77);
		System.out.println("Student A: "+ts.getPercentage()+"%");
		
		
		StudentB stb = new StudentB(88,98,78,63);
		System.out.println("Studen B: "+stb.getPercentage()+"%");
	}

}
