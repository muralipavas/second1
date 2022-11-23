package com.program;

import java.util.Scanner;

public class ReverseStringScanner {

			
public static void main(String[] args) {
     String op = "";
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter your name==");
	String s=scanner.nextLine();
	System.out.println("Your reverse name==");
	for (int i = s.length()-1;i>=0; i--) { 
	      op+=s.charAt(i);
	}
	System.out.println(op);
	if (s.equals(op)) {
		System.out.println("is palindrome");
		
		
	} else {
		System.out.println("is not");

	}
}
}
