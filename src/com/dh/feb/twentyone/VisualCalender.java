package com.dh.feb.twentyone;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class VisualCalender {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//	
//		String time = scanner.nextLine().toString();
		String  time = "2017-2-23";
		DateFormat nowdate = new SimpleDateFormat("yyyy-MM-dd");
		//���ڸ�ʽ
		Calendar calendar = new GregorianCalendar();
		int day = calendar.get(Calendar.DATE);
		//���ø�ʽj
		try {
			Date date = nowdate.parse(time);
			
			//�ַ���ת��Ϊ����
			calendar.setTime(date);
			//���������õ�calendar����
			calendar.set(calendar.DAY_OF_MONTH, 1);

			//System.out.println(calendar.get(calendar.DAY_OF_WEEK));
		
			//System.out.println(calendar.getActualMaximum(calendar.DATE));
			System.out.println(calendar.get(calendar.DAY_OF_WEEK));
			System.out.println(calendar.getActualMaximum(calendar.DATE));
			System.out.println("һ\t��\t��\t��\t��\t��\t��");
			for(int j=1;j<calendar.get(calendar.DAY_OF_WEEK)-1;j++){
				System.out.print("*\t");
			}
			//System.out.println(calendar.get(calendar.SATURDAY));
			for(int i=1;i<=calendar.getActualMaximum(calendar.DATE);i++){
				if(i==day){
					System.out.print("@");
				}
				System.out.print(i+"\t");
				int nowday = calendar.get(calendar.DAY_OF_WEEK);
				//System.out.print(nowday);
				//System.out.println(calendar.SUNDAY);
				if(nowday==calendar.SUNDAY)
				System.out.print("\n");
				calendar.add(calendar.DATE, 1);
			}
		
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
