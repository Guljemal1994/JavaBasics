package class26_Encapsulation_and_Collections;

public class ReplPersonEn {

	/*
	 * Create the a Person class with the following: Class Variables firstname
	 * lastname birthmonth birthday birthyear String ssn
	 * 
	 * Constructor The main constructor should take in all values and assign them to
	 * their respective private class variables
	 * 
	 * Methods Create a public getters to access all the variables.
	 * 
	 * Create a public method called formatBirthday, which will return a String
	 * composed of their birthday in mm/dd/yyyy format. For example, if
	 * birthmonth=3, birthday=22, birthyear=2000, it should return the String
	 * "3/22/2000"
	 * 
	 * in Main Class.
	 * 
	 * Instantiate and object of Person and provide values. follows below outputs
	 * for values.
	 * 
	 * using getter and method print them separately. Note: Read carefully the
	 * steps.
	 * 
	 * Expected Output:
	 */
	private  String firstname, lastname,ssn;
	private  int birthmonth, birthday, birthyear;
	private String formatBirthday;
	
	ReplPersonEn (String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn){
	  this.firstname=firstname;
	  this.lastname=lastname;
	  this.birthmonth=birthmonth;
	  this.birthday=birthday;
	  this.birthyear=birthyear;
	  this.ssn=ssn;
	}
	public String getFirstName(){
	  return firstname;
	}
	public String getLastName(){
	  return lastname;
	}
	public int getBirthMonth(){
	  return birthmonth;
	}
	public int getBirthday(){
	  return birthday;
	}
	public int getBirthYear(){
	  return birthyear;
	}
	public String getSsn() {
		return ssn;
	}
	public String getFormatBirthday() {
		return formatBirthday;
	}
	public void setFirstname(String firstname){
	  this.firstname=firstname;
	}
	public void setLastName(String lastname){
	  this.lastname=lastname;
	}
	public void setSsn(String ssn){
	  this.ssn=ssn;
	}
	public String setFormatBirthday(int birthmonth, int birthday, int birthyear){
	  this.birthmonth=birthmonth;
	  this.birthday=birthday;
	  this.birthyear=birthyear;
	  formatBirthday=(birthmonth+"/"+birthday+"/"+birthyear);
	 
	 
