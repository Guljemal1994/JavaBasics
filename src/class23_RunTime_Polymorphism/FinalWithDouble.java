package class23_RunTime_Polymorphism;

public class FinalWithDouble {

	public final static double jemka(int[] array) {
		double sum =0;
		double gul = 0;
		for(int vl:array) {
			sum = sum+vl;
			gul = sum/array.length;
		}
		return sum;
	}

public static void main(String[] args) {
	
	int [] a = {11,3,6,4,8,22};
	System.out.println(jemka(a));
}














}
