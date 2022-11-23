package javaprogram;

public class ReverseString {
public static void main(String[] args) {
	//======using string concatenation=====
	String s="murali";
	String output="";
	
    /*
 	for (int i = s.length()-1;i>=0; i--) {
		output+=s.charAt(i);
	}
	System.out.println(output); 
	*/
	
	//======using character array======
/*	char a[]=s.toCharArray();
	for (int i =a.length-1; i>=0; i--) {
		output+=a[i];
	}
	System.out.println(output); */
	
	//====using string buffer class=======
	//StringBuffer sb=new StringBuffer(s);
	//System.out.println(sb.reverse());
	
	StringBuilder sb=new StringBuilder(s);
	System.out.println(sb.reverse());
	}
}
