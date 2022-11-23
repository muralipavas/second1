package com.program;

import java.util.Scanner;

public class If_Statement {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	double celcius=s.nextDouble();
	if (celcius<=25) {
		System.out.println("cool");
	}
		else if (celcius<=30) {
			System.out.println("hot");
		}
		else {
			System.out.println("very hot");
		}
			
		
		
	}
}

