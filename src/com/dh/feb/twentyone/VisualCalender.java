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
		Scanner scanner = new Scanner(System.in);
	
		String time = scanner.nextLine().toString();
		int i;
		
		//���ø�ʽ
		try {
			//String  time = "2017-2-10";
			DateFormat nowdate = new SimpleDateFormat("yyyy-MM-dd");
			//���ڸ�ʽ
			Calendar calendar = new GregorianCalendar();
			Date date1 = nowdate.parse(time);
			
			//�ַ���ת��Ϊ����
			calendar.setTime(date1);
			int day = calendar.get(Calendar.DATE);
			//System.out.println(day);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			int max=calendar.getActualMaximum(Calendar.DATE);
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			for(int j=1;j<calendar.get(Calendar.DAY_OF_WEEK);j++){
				System.out.print("\t");
			}//calendar.getActualMaximum(Calendar.DATE)
			for(i=1;i<=max;i++){
				if(i==day)
					System.out.print("*");
				System.out.print(i+"\t");

				if(calendar.get(Calendar.DAY_OF_WEEK)==calendar.SATURDAY){
					System.out.print("\n");
				}
				calendar.add(Calendar.DATE, 1);
				
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
