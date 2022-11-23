package com.program;

import java.util.ArrayList;

public class Collection {
	int a[]=new int[5]; // array=fixed size
	public static void main(String[] args) {
		System.out.println("==========arraylist=========");
		ArrayList<Integer> alist=new ArrayList<Integer>(); //arraylist=flexible size
		for (int i = 1; i <=10; i++)
			alist.add(i);
		
		alist.add(100); //add pannikalam evalav nalum
		
		System.out.println(alist);
		System.out.println(alist.get(9)); //get method
		alist.set(0, 99);
		alist.remove(1);
		System.out.println(alist);
		
		alist.removeAll(alist);
		
		alist.retainAll(alist);
		System.out.println(alist);
		
		
		ArrayList<String>slist=new ArrayList<String>(); //yethunalum  string kulla eduthukalam
		slist.add("1000");
		
		ArrayList elist=new ArrayList(); //yethunalum kudukalam
		elist.add(0);
		elist.add('c');
		elist.add("pavas");  
		
		
		
		
		
			
		
	}

}
