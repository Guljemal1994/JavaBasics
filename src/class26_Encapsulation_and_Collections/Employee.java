package class26_Encapsulation_and_Collections;

public class Employee {

	//define private variables 
	private String name , lastname;
	private int age;
	private  double salary;

     //define public methods to givn access to private variables
    public String getName() {//getters
    	return name;
    }
	public int getAge() {//getters 
		return age;
	}
	public double getSalary() {//getters
		return salary;
	}
	public void setName(String name) {//setters
		if(!name.isEmpty() && name.length()>3) {
			this.name = name;
		}
		
	}
	public void setAge(int age) {//setters
		this.age = age;
	}
	public void setSalary(double salary) {//setters
		this.salary = salary;
	}
}
