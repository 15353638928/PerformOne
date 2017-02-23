package com.dh.feb.before;

public class Test2 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "ΑυµΒ»ª";
		s1.age = 10;
		Computer c = new Computer();
		c.brand = "lianxiang";
		c.cpuSpeed =  100;
		s1.com = c;
		c.brand = "daier";
		
		String str = "daier";
		System.out.println(s1.com.brand.equals(str));
	}
}
