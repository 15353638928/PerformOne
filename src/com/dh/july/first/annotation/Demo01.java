package com.dh.july.first.annotation;

import java.util.Date;

public class Demo01 {
	
	@Override
	public String toString(){
		
		return "";
	}
	@SuppressWarnings("all")
	public static void main(String[] args) {
		Date date = new Date();
		Test001();
	
	}
	@Deprecated
	public static void Test001(){
		
	}
}
