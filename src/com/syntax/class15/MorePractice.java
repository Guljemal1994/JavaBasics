package com.syntax.class15;

public class MorePractice {

	public static void main(String[] args) {
		
		MorePractice obj = new MorePractice();
		int num =obj.smallest(20,25);//1-30 cenli sanlarda odd sanlary cykaryar we ture 
		//ondan yokary bolan sanlarda wn false cykaryar
		boolean flag = obj.isOdd(num);
		System.out.println("The largest number "+num+" odd number is "+flag);
	}
  //void is keyword does not give anything back
	int smallest(int g, int k) {
		int smallest;
		if(g>k) {
			smallest= g;
		}else {
			smallest= k;
		}
	return smallest;
	}
	//void we will use when we do not want to return anything does not give anything back to me
	
     boolean isOdd(int num) {//yes or no da etjek bolyanymyz ucin boolean ulandy
		boolean isOdd;
		if(num%2==0) {
			isOdd = false;
		}else {
			isOdd = true;
		}
	    return isOdd;
	}
	
	
	
	
}
