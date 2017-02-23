package com.dh.feb.Twenty;

import java.util.Date;

public class Test01 {
	public static void main(String[] args) {
		Integer aInteger = null;
		System.out.println(aInteger);
		Date  aDate = new Date(1000);
		Date  aDate2 = new Date(10000);
		System.out.println(aDate.before(aDate2));
		
		System.out.println(aDate);
	}

}
