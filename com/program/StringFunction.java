package com.program;

public class StringFunction {
	public static void main(String[] args) {
		String a="hai pavas";
		String b="HAI PAVAS";
		String c="";
		String d=null;
		String e="   hey good looking         ";
		int length=a.length();
		System.out.println(length);
		
		boolean equal=b.equals(a);
		System.out.println(equal);
        System.out.println(b.length());
        
        System.out.println(b.equalsIgnoreCase(a));  //boolean
        System.out.println(a.toUpperCase());
        System.out.println(b.toLowerCase());
        System.out.println(b.startsWith("H"));   //boolean
        System.out.println(b.startsWith("h"));   //boolean
        System.out.println(b.endsWith("S"));     //boolean
        System.out.println(b.endsWith("s"));     //boolean
       System.out.println(a.contains("p"));      //boolean
       System.out.println(a.contains("r"));      //boolean
       System.out.println(e.indexOf("y"));
       System.out.println(e.indexOf("o"));
       System.out.println(e.lastIndexOf("o"));
       System.out.println(a.charAt(4));
	System.out.println(a.substring(1));
	System.out.println(c.isEmpty());       //boolean
	System.out.println(c.isBlank());       //boolean
	System.out.println(e.trim());
	String[] split=a.split("");
	for (String sp : split) {
		System.out.println(sp);
		}
		System.out.println(a.replace("pavas", "murali"));
	}

}
