package com.program;

import java.util.Iterator;

public class For_Loop {
	public static void main(String[] args) {
          for (int i = 0; i <=5; i++) {
			System.out.println("*"); //for  loop
			}      
//===================================================
     	for (int j = 0; j < 5; j++) {
			
			for (int i = 0; i < 3; i++) {
				
			System.out.println(i);//nested if
			
				System.out.println(j);
			}}                       
//================================================


		 int b[]= {1,2,3,4,5};
		 int sum= 0;
		for (int i = 0; i < b.length; i++) 
			System.out.println(b[i]);
			for (int m : b) 
			System.out.println(m);
				
	                                           //for each
			for (int m : b) {
				sum+=m;
				
			}	
			System.out.println("sum is"+sum); 
		
		String[] c= {"murali","krishna","pavas"};
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			
		}
		
		
	}}
			
		
		
			
		
	


