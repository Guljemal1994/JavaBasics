package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {

	public static void main (String[] args) {
		
		/*You are a selsman
		 * ask a user how much his sales are
		 * based on the amout of sales we need to calculate his commision
		 * if sales is between1-100-->commision should be 10%
		 * if sales is between 100 and 200-->commision should be 20%
		 * if sales is between200-500-->commision should be 30%
		 * if sales more 500-->commision should be 30% 
		 * 
		 */
           
		//if your sales are 200-->40 i will get
		
		
		
		// 1. daclare all varible that i wiil need
		 Scanner scan;
	        double sales;
	        double commission;
	        
	        scan=new Scanner(System.in);
	        System.out.println("Please enter your sales amount");
	        sales=scan.nextDouble();
	        
	        if(sales>=1 && sales<=100) {
	            //give user 10% commission
	            System.out.println("Based on your sales you commission is ="+(sales*0.1));
	        }else if(sales>100 && sales<=200) {
	            //give user 20% commission
	            System.out.println("Based on your sales you commission is ="+(sales*0.2));
	        }else if(sales>200 && sales<=500) {
	            System.out.println("Based on your sales you commission is ="+(sales*0.3));
	            //give user 30% commission
	        }else {
	            System.out.println("Based on your sales you commission is ="+(sales*0.5));
	        }
	      
	        
	        
	        
	    }
	

	
	
	
	
	
	
	
	

	}


