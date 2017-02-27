package com.dh.feb.twentyfive;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestMain {
	public static void main(String[] args) {
		int c = TestStatic.a;
		String dString = TestStatic.Add("22",55);
		System.out.println(TestStatic.a);
		Calendar aaa = new GregorianCalendar();
		
		aaa.set(Calendar.YEAR, 1234);
		System.out.println(aaa);

		
	}
}
