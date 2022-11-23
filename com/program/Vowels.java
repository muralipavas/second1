package com.program;

public class Vowels {
	public static void main(String[] args) {
		String name="murali";
		char[] vowels= {'a','e','i','o','u'};
		String output="";
		for (int i = 0; i < name.length(); i++) {
			for ( char op : vowels) {
				if (op==name.charAt(i)) {
					output+=name.charAt(i);
					}
				}
			}
System.out.println(output.length());
			}
}
