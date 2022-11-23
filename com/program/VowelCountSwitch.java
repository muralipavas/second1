package com.program;

public class VowelCountSwitch {
	public static void main(String[] args) {
		String name="fucking bullshit";
		int count=0;
		
		for (int i = 0; i < name.length(); i++) {
			char m=name.charAt(i);
			switch(m) {
			case 'a':
			case'e':	
			case 'i':
			case'o':	
			case 'u':
				count++;
			}
			}
		System.out.println(count);
	}
}
