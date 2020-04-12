package class16_Variables_in_Java;

public class InstanceVariables {

	String name = "julia";//instance variabla
	
	public static void main(String[] args) {
		
		String name = "Ben";
		System.out.println(name);
		
		InstanceVariables obj = new InstanceVariables ();//so anytime if i am trying access InstanceVariables I have to
		//create new object
		System.out.println(obj.name);//seydip yazsan yokarky name cykyar eken//julia
		
		
		obj.name = "Ali";//obj.name = "Ali"; sedip yazsan taze at berdigin bolyar variable
		System.out.println(name);//ben
		System.out.println(obj.name);//ali cykya 
		
		
		//chage value of local variable
		name = "Farid";
		System.out.println(name);//farid cykya sebabi taze at berdik
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
