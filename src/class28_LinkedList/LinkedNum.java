package class28_LinkedList;

import java.util.LinkedList;

public class LinkedNum {

	public static void main(String[] args) {
		
		 LinkedList<Integer> n = new LinkedList<>();
			
			int a=0;
			int b=1;
			int c;
			
			for(int i=1; i<=10; i++) {
				
				n.add(a);
				c=a+b;
				a=b;
				b=c;
			}
			
			for(int num:n) {
				System.out.print(num+" ");
			}
		           
		           
		           

	}

}
