package com.syntax.class16;

public class LocalVariablas {

	void nameInside() {
		String str= "Jhon";//local variable that visible only within method it was declared
	}
	
	public static void main(String[] args) {
		//System.out.println(name);Ce: name won't be visiabla to another method
		//since its scope only within nameInside method
		LocalVariablas obj = new LocalVariablas();
		boolean flag = true;
		
		if(flag) {
			String ansver = "Yes";
		}
		
		//System.out.println(ansver);CE: scope of variable answer is not visiable outside of if block
		
		for( int i= 1; i<=5; i++) {
			System.out.println(i);
		}
		for( int i= 1; i<=5; i++) {
			System.out.println(i);
		}
	} 
	
	
	
	
	
}
