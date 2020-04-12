package class22_Overriding_Polymorphism;

public class StudentTask {

//	Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 
//  Define common behavior within parent class and override some of the methods in child classes
//	Define some methods specific to child classes
//	Write example of achieving run time polymorphism
	
	
	public  void study() {
	   System.out.println("Syntax students are hard working students");
   }
  public void learn() {
	  System.out.println("Syntax teaching as Java");
  }
  public void getJob() {
	  System.out.println("I wish all Syntax students will get perfect job");
  }
}
class CollageStudents extends StudentTask{
	@Override
	public void study() {
		System.out.println("College students are making international friends");
	}
	public void life() {
		System.out.println("College students have a busy life");
	}
	public void essay() {
		System.out.println("College students  writing essay everyday :(");
	}
}
class SchoolStudens extends StudentTask{
	@Override
	public void study() {
		System.out.println("Some schools have own uniforum");
	}
	public void listen() {
		
		System.out.println("They should listen their teachers");
	}
}

