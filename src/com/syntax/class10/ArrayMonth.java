package com.syntax.class10;

public class ArrayMonth {

	public static void main(String[] args) {
		
		String [][] month= {
				{"January","February","December"},
				{"March", "April","May"},
				{"June", "July","August"},
				{"September", "October", "November"},
				};
		
		      System.out.println(month.length);//if use lenght will count arrays
		
		      
		      System.out.println("--------------------------------------------");
		      
		      String month1[][]= {
		              {"January","February","December"},
		              {"March","April","May"},
		              {"June","July","August"},
		              {"September","October","November"}
		              
		      };
		      System.out.println(month1[2][2]);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		 int rows=month.length;//how many arrays
		int firstArray=month[3].length;
		System.out.println(firstArray);
		
		for(int i=0; i<month.length; i++) {//iterates over rows
			for(int j=0; j<month[i].length;j++) {//iterates over columns
				System.out.println(month[i][j]);//use printwi " "  and syso with nothing
			}
		}
		
		
	}

}
