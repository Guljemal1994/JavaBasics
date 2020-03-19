package com.syntax.class09;

public class ClockNestedLoop {

	public static void main(String[] args) {
		
		for(int i=0; i<=23; i++) {
		  for(int p=1; p<=59; p++) {
			 if(p<10) {
				 System.out.println(i+":0"+p);
			 }else {
				System.out.println(i+":"+p);
			
			 }
				
			
			}
		}
		
		System.out.println("******************************");
		for (int i = 0; i < 10; i++) {
			for (int y = 0; y < 10; y++) {
				for (int l = 0; l < 10; l++) {
					for (int j = 0; j < 10; j++) {
					System.out.println(i + " " + j+" "+l + " " + j);
					}
				}
		
			}
		}

	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
