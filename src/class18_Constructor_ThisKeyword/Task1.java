package class18_Constructor_ThisKeyword;

public class Task1 {

	/*   Write a java program of Class Students that takes students name and 3 subject grades. 
	 * Inside your class also have a method to Calculate Average Grade. 
	 * Test Student class for 5 different students with different marks. 
	 * Your program should print an average mark of each students name.
	 *  
	 */
	
	
	String name;
	int grade1, grade2, grade3;
	
    Task1(String studentName1, int studentGarde1, int studentGarde2,int studentGarde3 ){
    	
    	name = studentName1;
    	
    	grade1 = studentGarde1;
    	grade2 = studentGarde2;
    	grade3 = studentGarde3;
    }
	
	public int result () {
		int total = grade1 + grade2+ grade3;
		int ava =total  /3;
		return ava;
	}
	
	public static void main(String[] args) {
		
		Task1 gul = new Task1 ("Ben", 80, 99, 70);
		System.out.println(gul.name+"'s total average "+gul.result());
		
		Task1 gul1 = new Task1 ("Konul", 88, 98, 97);
		System.out.println(gul1.name+"'s total average "+gul1.result());
		
		Task1 gul2 = new Task1 ("Kon", 99, 88, 100);
		System.out.println(gul2.name+"'s total average "+gul2.result());
		
	}
	
	
	
	
	
	
	
	
	
}
