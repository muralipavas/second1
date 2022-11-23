package com.program;

import java.util.Scanner;

public class Scanner_Method {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the first name");
String a=s.next();
System.out.println(a);


System.out.println("enter the second name");
String b=s.nextLine();
System.out.println(b);

System.out.println("enter the id");
int c=s.nextInt();
System.out.println(c);

System.out.println("enter the cgpa");
float d=s.nextFloat();
System.out.println(d);

System.out.println("enter the sec");
char e=s.next().charAt(0);
System.out.println(e);
   
System.out.println("enter the address");
String n=s.next().toString();
System.out.println(n);
s.close();
}
}
