package class02_String_Concatenation_and_Arithmeric_Operators;

public class VariableTask {

public static void  main (String[] args ) {
	
	String myName = "Julia";
	String myLastName =" Mert";
	char myGrade ='B';
	String myCity ="Dallas";
	String myState = "Texas";
	long myPhoneNum = 12521254225l;
	
	
	System.out.println(myName);
	System.out.println(myLastName);
    System.out.println(myGrade);
    System.out.println(myCity);
    System.out.println(myState);
    System.out.println(myPhoneNum);
    
    
    String name= " My name is ";
    String last= " My last name is";
    String grade= "My grade is perfect  ";
    String city= "I live in";
    String state ="My state is";
    String phone = " My phonenumber is";
    
    System.out.println (name + myName);
    System.out.println(last + myLastName);
    System.out.println(grade+myGrade);
    System.out.println(city + myCity);
    System.out.println(state + myState);
    System.out.println(phone + myPhoneNum);
    
    System.out.println (" My name is " + myName+ " and my last name is"+ myLastName);
	
	
	
	
	
	
	
	
	
}


}
