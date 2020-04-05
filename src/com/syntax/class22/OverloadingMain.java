package com.syntax.class22;

public class OverloadingMain {

	                        //type of parameter 
	public static void main(int[] args)	{
		System.out.println("Method with int array arguments");
	}
		                    //type of parameter     
	public static void main(String  args)	{
		System.out.println("Method with String array argument");
	}                        //type of parameter 
	public static void main(String args, String args1)	{
		System.out.println("Method with 2 String array arguments");
	}
public static void main(String[] args) {//Java always  looks for this main method with this signature
		
		System.out.println("Method with array arguments");//this is output
	
           OverloadingMain.main("s");
            main("Str");
            main("hello","hi");
            main(new int[2]);
}
	
	
    /*
     * (String args, String args1) we changing method signature
     * we have 4 versions of overloaded main methods
     * we can overload main method
     * again 2 rules  of overloading 
     * 1. change num of parameters 
     * 2.change type of patameters
     * 
     */
}
