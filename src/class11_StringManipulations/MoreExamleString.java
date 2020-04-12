package class11_StringManipulations;

public class MoreExamleString {

	public static void main(String[] args) {
		
		//lets create @D array in which we store professions
		
		String [][] professions = {
				{"QA Tester","Developers","Product Owner","Scrum Master"},
				{"Math Teacher","Science Teher", "ESL Teacher"},
				{"Dentist","Surgeon"}
		};
		
		//get elements using advanced for loop
		
		for(String[] occupation:professions) {//outer loop
			for(String title:occupation) {//inner loop
				System.out.print(title+" ");
				
			}
		     System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
