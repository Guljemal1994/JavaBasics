package class26_Encapsulation_and_Collections;

public class Account {

	/*
	 * Create Class Account Create the below variables: acc_no; name; email; double
	 * amount;
	 * 
	 * Create the getter/setter methods for each variable.
	 * 
	 * In Main Class and the main method. Using setter methods assign the values as:
	 * acc_no = 7560504000 name = Sumair email = sumair@syntax.com amount = 50000.0
	 * Using getter methods print the values as below output.
	 * 
	 */

	private long acnum;
	private String name;
	private String email;
	private double amount;

	public long getAcnum() {
		return acnum;

	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public double getAmount() {
		return amount;
	}

	public void setAcnum(long acnum) {
		this.acnum = acnum;
	}

	public void setName(String name) {
		this.name = name; 
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	public static void main(String[] args) {
		
		Account gul = new Account();
		gul.setAcnum(7560504000l);
		gul.setName("Sumair");
		gul.setEmail("Sumar.gamil");
		gul.setAmount(2012325.33);
		System.out.print(gul.getAcnum()+" ");
		System.out.print(gul.getName()+" ");
		System.out.print(gul.getEmail()+" ");
		System.out.print(gul.getAmount()+" ");
	}
}
