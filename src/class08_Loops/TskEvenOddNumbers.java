package class08_Loops;

public class TskEvenOddNumbers {

	public static void main(String[] args) {
		int sumx = 0;
		int sumy = 0;
		for (int x = 1; x <= 99; x++) {
			if (x % 2 != 0) {
				sumx = sumx + x;
			}
		}
		for (int y = 1; y <= 99; y++) {
			if (y % 2 == 0) {
				sumy = sumy + y;
			}
		}
		System.out.println("odd total " + sumx);
		System.out.println("even total " + sumy);
	}
	}


