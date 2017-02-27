package com.dh.feb.twentyone;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 * Date和Calendar转换实现可视化日历
 * @author admin-DH
 *
 */
public class VisualCalender {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String time = scanner.nextLine().toString();
		int i;
		
		//设置格式
		try {
			//String  time = "2017-2-10";
			DateFormat nowdate = new SimpleDateFormat("yyyy-MM-dd");
			//日期格式
			Calendar calendar = new GregorianCalendar();
			Date date1 = nowdate.parse(time);
			
			//字符串转换为日期
			calendar.setTime(date1);
			int day = calendar.get(Calendar.DATE);
			//获取当前日期是本月第几天
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			//eg:2017-2-9， 替换为2017-2-1 ，将当前日替换为1号
			int max=calendar.getActualMaximum(Calendar.DATE);
			//获取当前月份最大天数
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			//获取1号对应是本周第几天
			for(int j=1;j<calendar.get(Calendar.DAY_OF_WEEK);j++){
				System.out.print("\t");
			}
			//此处不适用calendar.getActualMaximum(Calendar.DATE),避免函数中日自增长超过合理的日期，eg:2.28变成2.31
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
