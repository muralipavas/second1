package com.program;

public class Construction {
public  Construction() {
	System.out.println("kamaraj college");
	}
public  Construction(int id) {
	System.out.println(id);
	}
public  Construction( String name,long num) {
	System.out.println(name);
	System.out.println(num);
	}
public  Construction(char sec) {
	System.out.println(sec);
}
public static void main(String[] args) {
	Construction a=new Construction();
	Construction a2= new Construction(77);
	Construction a3=new Construction("pavas", 9578765530L);
	Construction a4=new Construction('c');
		
}
}
