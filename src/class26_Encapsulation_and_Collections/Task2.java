package class26_Encapsulation_and_Collections;

abstract class Task2 {

	/*
	 * We have to calculate the average of marks obtained in three subjects by student A and by student B. 
	 * Create class ‘Marks’ with an abstract method ‘getPercentage’ that will be returning the average percentage of marks.
	 *  Provide implementation of abstract method in classes ‘A’ and ‘B’. 
	 *  The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as 
	 *  its parameters for student B.
	 *   Test your code
	 */
	
	public abstract double getPercentage();
}

class StudentA extends Task2{

	int mark1, mark2,mark3;
	StudentA(int mark1, int mark2, int mark3){
		this.mark1=mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	@Override
	public double getPercentage() {
		return (mark1+mark2+mark3)/3;
	}
}

class StudentB extends Task2{
	int mark1, mark2,mark3,mark4;
	StudentB(int mark1,int mark2,int mark3,int mark4){
		this.mark1=mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
	}
	@Override
	public double getPercentage() {
		return (mark1+mark2+mark3+mark4)/4;
	}
	
}
