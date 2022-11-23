package com.program;

public class Palindrome {
	public static void main(String[] args) {
		int num =566584;
		int op = 0;
		
		while (num>0) {
		int tem = num%10;
		
		op+=tem;
		 op =op*10;
		
		
		 num = num/10;
		}
		op=op/10;
		System.out.println(op);
		
		
		
		
	}

}
