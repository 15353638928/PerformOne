package com.dh.feb.before;

public class Recursion {
	static int a = 0;
	public static void test01(){
		a++;
		System.out.print(a+" ");
		if(a<10){
			test01();
			System.out.print(a+" ");
		}
		
	}
	public static void main(String[] args) {
		test01();
	}
}
