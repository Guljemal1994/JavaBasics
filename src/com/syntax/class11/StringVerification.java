package com.syntax.class11;

public class StringVerification {

	public static void main(String[] args) {
		
		String s= "Welcome Syntax Students";//false cykya sebabi S we s bolany ucin 
		String s1 = "Welcome Syntax students";
		
		//to compare 2 String 
		System.out.println("-----equals() equalsIgnoreCase FUNCTION---");
		
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1)); 
		
		
		String ecpected = "Home - Syntax Technologies";
		String actual = "      Home - Syntax Technologies";//fail sebabi boslyk ucin
		//first way
		if(actual.equals(ecpected)) {
			System.out.println("Test cae pass. Title are mached");
		}else {
			System.out.println("Test case fails. Titles are NOT matched");
		}
		
		if(actual.trim().equals(ecpected)) {
			System.out.println("Test cae pass. Title are mached");
		}else {
			System.out.println("Test case fails. Titles are NOT matched");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
