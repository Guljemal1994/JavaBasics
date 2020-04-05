package com.syntax.class21;

public class ProgrammingLanguage {
	String name;
	String variable;
	
	public ProgrammingLanguage(String name, String variable) {
		this.name = name;
		this.variable = variable;
	}
}

class Java extends ProgrammingLanguage{
	
	String constructors;
	
	Java(String name, String variable,String constructor){
		super(name,variable);
		this.constructors = constructor;
	}
	public void details() {
	System.out.println(name+"can have variables "+variable+" ands constructors "+constructors);
}
}

//class JavaScript extends ProgrammingLanguage{
//	
//	public void details() {
//		System.out.println(name+"can have variables "+variable);
//	}
//}