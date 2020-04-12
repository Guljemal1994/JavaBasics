package class11_StringManipulations;

import java.util.Scanner;

public class MYScannerString {

	public static void main(String[] args) {
		
		
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
