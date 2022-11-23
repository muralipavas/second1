package com.program;
public class ReverseString {
	public static void main(String[] args) {
		String input="madam";
		String output="";
		for (int i =input.length()-1;i>=0; i--) {
			output = output + input.charAt(i);}
			System.out.println(output);
			if (input.equals(output))
				System.out.println("palindrome");             // palindrome program
			else System.out.println("not palindrome");
			
		
	}
	
	

}
