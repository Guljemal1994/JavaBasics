package only.task;

public class Repl135 {

	 public static int maxValue (int[] array){
		  int max =array[0];
		  
		    for(int i=0; i < array.length; i++){
		      if(max <array[i]) {
		    	  max = array[i];
		      }
		    }
			return max;
		  }
		 
		  
		  

			public static void main(String[] args) {
				int[] arr = {5,12,-3,7,3,22};
				System.out.println(maxValue(arr)); //should print 22
			}
}


//public static void main(String[] args) {
//	int[] arr = {5,12,-3,7,3,22};
//	System.out.println(maxValue(arr)); //should print 22
//}
//
//public static int maxValue(int[] nums) {
//	int max = nums[0];
//	for (int i = 0; i < nums.length; i++) {
//		if (max < nums[i]) {
//			max = nums[i];
//		}
//	}
//	return max;










