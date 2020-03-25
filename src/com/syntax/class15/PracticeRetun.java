package com.syntax.class15;

public class PracticeRetun {

	public static void main(String[] args) {

		PracticeRetun obj = new PracticeRetun();
		
		int num = obj.largest(12,25);//>uly san //<kici san
		System.out.println(num);
	}

	 int largest(int i, int j) {
		int largest;
		if(i>j) {
			largest =i;
		}else {
			largest= j;
		}
		return largest;
	}

}
