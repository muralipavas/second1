package javaprogram;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your number");
		int num=scan.nextInt();
		//=========using algorithm=================
	/*	int reverse=0;
		while (num!=0) {
			reverse=reverse*10 +num%10;
			num=num/10;
		}
		
		System.out.println(reverse);*/
		
		//==========Using StringBuffer class=========
		/* StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();

	
		System.out.println(rev); */
		//=========StringBuilder class=========
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		System.out.println(sb.reverse());
		
		
		
		
		
		
	}

}
