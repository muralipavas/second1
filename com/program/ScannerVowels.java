package com.program;

import java.util.Scanner;

public class ScannerVowels {
public static void main(String[] args) {
	int count=0;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter your name=");
	String name=scanner.nextLine();
	
	for (int i = 0; i < name.length(); i++) {
		char v=name.charAt(i);
		switch(v){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': 
			count++;
			}
		}
	if (count==0) 
		
	System.out.println("No vowels");
	else
	System.out.println("count of vowels=="+ count);
	}
}

