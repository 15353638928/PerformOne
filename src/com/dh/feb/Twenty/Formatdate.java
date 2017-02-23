package com.dh.feb.Twenty;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Formatdate {
	public static void main(String[] args) {
		long a = System.currentTimeMillis();
		DateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date(99911299999l);
		
		System.out.println(dFormat.format(date));
		String year = "2017-12-12 10:10:10";
		DateFormat dFormat2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			
			System.out.println(dFormat2.parse(year));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Calendar calendar = new GregorianCalendar();
		calendar.set(2017, calendar.MONTH, calendar.DAY_OF_YEAR);
		System.out.println(calendar.MONTH+"=calendar"+calendar.DAY_OF_YEAR);
		System.out.println(System.currentTimeMillis()-a);
	}
}
