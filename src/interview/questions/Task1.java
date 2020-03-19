package interview.questions;

public class Task1 {

	public static void main(String[] args) {
		
		
//		Write a program to swap 2 numbers without a temporary variable?
			// Swap  2 strings without a temporary variable?
			// let's write two variable:
			int a=5;
			int b=4; // so here we want to swap variable and want to make: a=4,b=5
			// so how can we make it.
			// let's first understand and use swapping method by using third temporary variable
			int temp=a; //  -----> so here we swapped our numbers by using third variable
			a=b;        // temp=5    a=4      b=5
			b=temp;
			System.out.println("The value of a: "+a);
			System.out.println("The value of b: "+b);
			System.out.println();
			System.out.println("--------------without using third variable----------------");
			System.out.println();
			System.out.println("----1st way------");
			int x=9;
			int y=20;
			// i can use this method:
			x=x+y; // x=9+20---> x=29, y=20
			y=x-y; // y=29-20---> x=29, y=9
			x=x-y; // x=29-9----> x=20, y=9 -----> here we swapped our variable
			System.out.println("The value of x:"+x);
			System.out.println("The value of y:"+y);
			System.out.println();  //156----> 1x100+5x10+6x1   1=10'0, 10=10'1 , 100=10'2
			System.out.println("----2nd way-----");    // 2'0, 2'1, 2'2, 2'3
			System.out.println("---Using binary---");
			int t=3; // lets convert to binary---> 3:2=1 rem=1, start with the last number 3=>>11
			int r=9; // lets convert to binary---> 9:2=4 rem=1, 4:2=2 rem=0, 2:2=1 rem=0, 1:2
					// as 1 is smaller than 2 we will take 1; 9=>> 1001	
			// t=0011 r=1001
			t=t^r; // t=0011^1001---> t=1010, r=1001
			r=t^r; // r=1010^1001----> r=0011, t=1010
			t=t^r; // t=1010^0011------> t=1001, r=0011
			System.out.println("the value of t:"+t);
			System.out.println("the value of r:"+r);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
