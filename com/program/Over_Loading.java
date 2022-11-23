package com.program;
public class Over_Loading {
	public void pavas_datatype(String schoolname) {
		System.out.println(schoolname);
		}
	public void pavas_datatype(int id,String name,char sec) {
		System.out.println(id);
		System.out.println(name);
		System.out.println(sec);
		}
	public void pavas_datatype(int m1,int m2,int m3) {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
	}
	public static void main(String[] args) {
		Over_Loading O=new Over_Loading();
		O.pavas_datatype("Tancem");
	O.pavas_datatype(7, "murali", 'A');
	O.pavas_datatype(99, 80, 70);
	}
}
