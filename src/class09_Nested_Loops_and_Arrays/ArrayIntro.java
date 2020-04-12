package class09_Nested_Loops_and_Arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num=10;
		
		int num1;
		num1=10;
		
		//declare an array n inilialize it
		
		int[] array=new int [4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		//access element from an array
		System.out.println(array[1]);
		
		
		//2 way
     
		String[] carArray = new String[3];//perffered way
		String carArray1[];
		carArray[0] = "BMW";
		carArray[1] = "Honda";
		carArray[2] = "Toyota";
		System.out.println("I am driving "+carArray[2]);
		
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^");
		
		
		int[] number=new int[3];
		number[0] = 100;
		number[1] = 200;
		number[2] = 300;
		//change value of number[1]
		number[1] = 2000;
		
		System.out.println(number[1]+number[0]);//2100 
		
		
		
		
		
		
		
	}

}
