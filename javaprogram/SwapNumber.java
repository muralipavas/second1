package javaprogram;

public class SwapNumber {
	public static void main(String[] args) {
		int a=20,b=30;
		System.out.println("before swapping values are=" +a+"   "+b);
		
//========method 1 third variable========
		
	/*	int c=a;
		 a=b;
		 b=c;     */
		
		//=======use +,-
		
	/*	a=a+b;                           //a=a*b
		b=a-b;                           //b=a/b
		a=a-b;    */                       //a=a/b
		
		//======bitwise xor (^)
	/*	a=a^b;
		b=a^b;
		a=a^b;  */
		
		//=====Singlestatement
				b=a+b-(a=b);
		 
		 
	
	System.out.println("after swapping values are= "+a+"   "+b);
	
	
	
	
	
	}

}
