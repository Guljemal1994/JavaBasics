package interview.questions;

public class quiz1 {

	public static void main(String[] args) {
	
		int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

		for ( int index= 0 ; index < 5 ; index++ ) {
		       System.out.print( egArray[ index ] + " " );
		}
		System.out.println("----------------------");
		
		System.out.println();
		char array_variable [] = new char[10];
		for (int i = 0; i < 10; ++i) {
		         array_variable[i] = 'i';
		         System.out.print(array_variable[i] + " ");
		}
		System.out.println();
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		
		System.out.println();
		
		
		int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		int what = array[0];

		for (int index = 0; index < array.length; index++) {

		       if (array[index] > what) {

		                  what = array[index];

		        }

		}

		System.out.println(what);
		
		
		
		System.out.println("**********************");
		
		int[] zip = new int[5];

		zip[0] = 7;
		zip[1] = 3;
		zip[2] = 4;
		zip[3] = 1;
		zip[4] = 9;

		System.out.println( zip[ 2 + 1 ] );
		
			
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		
		for(int i=1; i<15; i=i+3) {

		    System.out.print(i);

		}
		
		System.out.println();
		System.out.println("?????????????????????????");
		System.out.println();
		
		int x=1;

		while(x<5) {   

		   x++;   

		   System.out.print(x);

		}
		
		System.out.println();
		
		System.out.println("##########################");
		
		System.out.println();
		
//		
//		int z = 0;
//	     for (int y = 0; y >= z; y++) {
//	         System.out.print(y + "~");
//	         System.out.println(z);
//	     }
//	 
		
		
System.out.println();
		
		System.out.println("##########################");
		
		System.out.println();
		
		
		int count = 0;
		while (count++ < 10) {
		System.out.println("Welcome to Java");
		}
		
		
		
		
System.out.println();
		
		System.out.println("###############");
		
		System.out.println();
		
		int y = 0;
		for (int i = 0; i < 10; ++i) {
		y += 1;
		}
		System.out.println(y);
		
		System.out.println("**************************");
		
		for(int i = 0; i <= 5; i++ ) {
			   System.out.println("i = " + i );
			}

			int i =0;
			System.out.println("i after the loop = " +i );
		
		
//	System.out.println("+++++++++++");	
//		
//		
//	 for(int j = 0; j <= 5; j++ )
//     {
//         System.out.println("i = " + j );
//     }
//		
//		
//		
//		
//		System.out.println("**************");
//		
//		
//		
//		int k=3, tot=0;
//
//		do{
//
//		   tot=tot+k;
//
//		   k++;
//
//		} while(k<11);
//
//		System.out.print(tot);
//		
		
//			int x1=1;
//
//			do{
//
//			   x1++;
//
//			   System.out.print(x1);
//
//			}while(x1<5);
//		
//		
		
		System.out.println("---------------");
		
//		
//			int z=2, sum=0;
//
//			while(z<9) {
//
//			   z++;
//
//			   sum=sum+z;
//
//			}
//
//			System.out.print(sum);
//
//			

		
		int m=2, total=0;

		while(m<6) {

		   total=total+m;

		   m++;

		}

		System.out.print(total);

		
		
		
		
		
		
		
	}

}
