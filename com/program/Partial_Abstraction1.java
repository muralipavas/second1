package com.program;

public  class Partial_Abstraction1 extends Partial_Abstraction {
	@Override
	public void studentsec() {
		System.out.println('m');
	}
	public static void main(String[] args) {
		Partial_Abstraction1 p=new Partial_Abstraction1();
		p.studentid(77);
		p.studentname("pavas");
		p.studentsec();
	}
	

}
