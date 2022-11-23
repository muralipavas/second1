package com.program;

import java.util.Scanner;

public class While_loop {
	public static void main(String[] args) {
		
	
		
	/*      	i=1;
		while (i<5) {
			System.out.println("*");
		i++;
		}                                      */
		
	/*	int j=5;
		do {
			System.out.println(j);        
			j++;                          // thappa iruthalum oruvati execute agirum
		} while (j<5);          */
		int i = 1;
		int n;
		String n1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter your rating");
		
		n=scanner.nextInt();
		
		
		if (i<=n) {
			while (i<=n) {
				System.out.println("*");
				i++;
			}
			
		}
		else {
			System.out.println("valid data va type pannuda lusu k****0");
		}
		
		System.out.println("please enter your feed back");
		n1 =scanner.toString();
		System.out.println("");
			
	
	}
}
