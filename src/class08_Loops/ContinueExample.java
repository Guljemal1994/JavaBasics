package class08_Loops;

public class ContinueExample {

	public static void main(String[] args) {
		//write program that print numbers from 1 to 100
		//i do not want to print 33-35
		for(int i=1; i<=100; i++) {
			if(i>=35 && i<=55) {
				continue;
			}
		System.out.println(i);
		}

	}

}
