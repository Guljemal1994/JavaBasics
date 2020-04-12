package class12_StringManipulations;

public class StringExamle {

	public static void main(String[] args) {
		
		String s= "Good Morinng";
		String s1 = "Student";
		String s2 = " !";
		
		s = s.trim().concat(s1).concat(s2);
		
		System.out.println(s);
		
		String str5 = "Day";
		int date = 25;
		//str5.concat(date);error berya sebabi concat dine Stringde ulanylyar
		
		
		String str6 = "Hello";
		String str7 = "Synatx";
		str6=str6.trim().concat(str7);
		System.out.println(str6);//HelloSyntax 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
