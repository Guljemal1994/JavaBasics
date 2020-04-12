package class11_StringManipulations;

import java.util.Scanner;

public class BayramgulsScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your username: ");
		String username = scan.nextLine();
		System.out.print("Please enter your password: ");
		String password = scan.nextLine();
		System.out.println("Please confirm your password");
			String confirmedPassword = scan.nextLine();
			if(username.isEmpty() || password.isEmpty()) {
				System.out.println("Username and Password cannot be empty");
			}else {if(password.length()<8) {
				System.out.println("Password is too short");
			}	
			if(password.contains(username)) {
				System.out.println("Password cannot contain username");
			}if(!(password.equals(confirmedPassword)) ){
				System.out.println("Passwords do not match");
			}else if (password.equals(confirmedPassword)&& !password.contains(username)&&password.length()>=8){
				System.out.println("Your username and password has been created");
			}
			}
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Hayyst adynyzy yazyn:");
		String ady = s.nextLine();
		System.out.println("Hayyst parolynyzy yazyn:");
		String cody = s.nextLine();
		System.out.println("Parolynyzy  barlan:");
		String barla  = s.nextLine();
		if(ady.isEmpty() ||cody.isEmpty()){
			System.out.println("Adynyz bos bolup bilenok");
		}else {if(cody.length()<8) {
			System.out.println("Parolynyz gaty gysga");
		}
			if(cody.contains(ady)) {
				System.out.println("Menzes bolmaly dal");
				
			}if(!(cody.equals(barla))) {
				System.out.println("Parolynyz menzes dal");
			}else if(cody.equals(barla)&& !cody.contains(ady) && cody.length()>=8) {
				System.out.println("Sizin hasabynyz hasaba goyulan");
			}
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
	}

}
