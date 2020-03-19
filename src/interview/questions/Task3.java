package interview.questions;

public class Task3 {

	public static void main(String[] args) {
		// print first 10 fibonacci numbers
					//System.out.println("Please provide input:");
					//Scanner sc=new Scanner (System.in);
			        //int input=sc.nextInt();
					int input=9;
			        int n1=0;
			        int n2=1;
			        int sum=0;
			        System.out.print(n1+"   "+n2);
			        for(int i=2;i<=input; i++) {
			        	sum=n1+n2;
			           System.out.print("   "+sum);
			           n1=n2;
			           n2=sum;
			        }System.out.println();
			        //arrayle fibonacci yazdirma
			        int [] fib=new int[10];
			        fib[0]=0;
			        fib[1]=1;
			        for(int i=2; i<fib.length; i++) {
			        	fib[i]=fib[i-1]+fib[i-2];
			        }for(int y=0;y<10;y++) {
			        System.out.print(fib[y]+"   ");
			        }System.out.println();

			        
			        
			        
			        
			        
			        
			        
			        
			        
			        

	}

}
