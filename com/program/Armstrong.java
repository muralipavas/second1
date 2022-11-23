package com.program;

public class Armstrong {
	public static void main(String[] args) {
		int num=153;
	    int output=0;
	    int temp;
	    while (num>0) {
			
		
	    temp=num%10;
	    output=output+temp*temp*temp;
	    num=num/10;
	    }
	   
	   System.out.println(output);
	    
	   }
	
	}
