    package com.program;
    public class Sub_Over_Riding extends Over_Riding{
	@Override
	public void empid(int id) {
		super.empid(id);
	}
	@Override
	public void empname(String name) {
		super.empname(name);
	}
	@Override
	public void empsec(char sec) {
		super.empsec(sec);
    }
    public static void main(String[] args) {
	Sub_Over_Riding s=new Sub_Over_Riding();
	s.empid(77);
	s.empname("pavas");
	s.empsec('m');
    }
    }
