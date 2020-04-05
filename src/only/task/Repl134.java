package only.task;

public class Repl134 {

	protected static String maxLength (String[] array){
		  
		    String max = "";
		    String maxLength = "";
		    for (int i = 0; i < array.length; i++){
		      if(array[i].length() > maxLength.length()){
		        maxLength = array[i];
		      }
		      
		    }
			return maxLength;
		  
	}

			public static void main(String[] args) {
				String[] arr = {"hey","yolo","hi","this is long"};
				System.out.println(maxLength(arr));
				//should print "this is long"
			}
}
