package class10__Arrays_and_2D_Arrays;

public class Repl832D {

	public static void main(String[] args) {

		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
	    int sum1= 0;
	    int sum2= 0;
	    int sum3= 0;
	    int sum4=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(i==0) {
				sum1+=a[0][j];
				}else if(i==1) {
					sum2+=a[i][j];
				}else if(i==2) {
					sum3+=a[i][j];
				}else {
					sum4+=a[i][j];
				}
			}
		}System.out.println(sum1);
				System.out.println(sum2);
				System.out.println(sum3);
				System.out.println(sum4);
	
	
	
	
	
	

				int[][] nums = {
						{1,1,2}, //sum = 4
						{3,1,2}, //sum = 6
						{3,5,3}, //sum = 11
						{0,1,2}  //sum = 3
					};


				int sums[] = new int[nums.length];
				
					for (int i = 0; i < nums.length; i++) {
						int rowSum = 0;
						for (int j = 0; j < nums[i].length; j++) {
							rowSum += nums[i][j];
						}
						sums[i] = rowSum;
					}

				for(int sum : sums) {
						System.out.println(sum);
			  }
	
	
	
	
	
	
	
	}

}
