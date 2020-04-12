package class04_Nested_If;

public class NestedIfContinues {

	public static void main(String[] args) {

		//check if patient has any allergies
		//if no allergies --> you're healthy
		//otherwise ceck if patient has:
		//Orange allergy-->do not eat orange
		//apple allergy-->do not eat apple
		//kiwi allergy-->do  ot eat kiwis
		
		boolean allergy=true;
		boolean appleAllergy=false;
		boolean orangeAllergy=true;
		boolean kiwiAllergy=false;
		
		if(allergy) {
			System.out.println("Please answer below"); 
			
		if (orangeAllergy) {
			System.out.println("Don't eat orange");
		}
		}else {
			System.out.println("You are healthy");
		}
		
		
		
	 

	}

}
 