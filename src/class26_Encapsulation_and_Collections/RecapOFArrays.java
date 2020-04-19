package class26_Encapsulation_and_Collections;

public class RecapOFArrays {

	public static void main(String[] args) {

		int num = 10;
		DoctorEncapsulation doc = new DoctorEncapsulation();

	int[] numbers = { 10, 20, 30, 40 };
	DoctorEncapsulation[] doc1 = { new DoctorEncapsulation(), new DoctorEncapsulation(), new DoctorEncapsulation() };

		String[] name = new String[2];
		name[0] = "Ben";
		name[1] = "Jem";
		System.out.println("---------------");
       //during the run time we Java will give exceptions becouse arrays are fixed in size
		//name[2] = "Hel";
	}
}
