package class19_ThisKeyword_Inheritance;

public class PracticeThis {

	String name,lastName;
	long phoneNumber;
	
	
	public PracticeThis(String name, String lastName ,long num) {
		
		this.name = name;
		this.lastName = lastName;
		this.phoneNumber = num;
	}

  public void display() {
	  System.out.println("My name is "+name);
  }
  public void display1() {
	  System.out.println("My last name is "+lastName);
  }
   public void dislay2() {
	   System.out.println("My phone number is "+phoneNumber);
   }

   public static void main(String[] args) {
	
	   PracticeThis obj = new PracticeThis("Gul", "Mert",1234567);
	  // PracticeThis("Gul", "Mert",1234567); we cannot call only like this 
       obj.display();
       obj.display1();
       obj.dislay2();
   
   
   
   
   
   
   
   
   
   
   }

}
