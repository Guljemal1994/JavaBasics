package class22_Overriding_Polymorphism;

public class Employee {//Parent class

	double salary;
	
   void getPaid() {//getPaid is method name

	  System.out.println("Employee get's paid "+salary); 
   }
	void work() {
		System.out.println("Employee works");
	}
}


class FullTimeEmployee extends Employee{
	
}



class PartTime extends Employee{
	
}


class Constructor extends Employee{
	double houlyRate;
	void getPaid() {//getPaid is method name
		System.out.println("Constructor get's paid "+houlyRate);
	}
}