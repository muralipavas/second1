package com.program;

public class MagicNumber {
	public static void main(String[] args) {
		int num=9999;
		int output=0;
		int temp;
		int perfect=0;
		
	
		while (num>0) {
			
		temp=num%10;
		output=output+temp;
		num=num/10;
		}
		
		perfect=output%10;
		output=output/10;
		output=perfect+output;
		
		
		
		System.out.println(output);

}}
