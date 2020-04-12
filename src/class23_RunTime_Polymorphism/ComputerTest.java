package class23_RunTime_Polymorphism;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer apple = new Apple("Apple Macbook");
		Computer lenove = new Lenove(" Lenove");
		Computer hd = new HD("HD");
		
		Computer[] comps = {new Apple("Apple Macbook"),new Lenove("Lenove"),new HD("HD")};
		for(Computer c:comps) {
			c.run();
			c.save();
			c.screenShot();
		    c.transfer();
		    
		    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		    
		}
		
		
	}
	
	
	
}
