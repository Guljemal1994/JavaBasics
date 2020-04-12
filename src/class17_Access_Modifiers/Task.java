package class17_Access_Modifiers;

public class Task {

	int arr(int[] x) {
		int sum = 0;
		for(int i=0; i<x.length; i++) {
			sum=sum+x[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Task obj = new Task();
		int y[] = {12,30,60,50};
		int rr =obj.arr(y);
		System.out.println("SUm ="+rr);
	}
	
	
	
	
	
	
	
	
}
