package com.dh.feb.twentyone;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 * Date��Calendarת��ʵ�ֿ��ӻ�����
 * @author admin-DH
 *
 */
public class VisualCalender {

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
			//��ȡ��ǰ�����Ǳ��µڼ���
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			//eg:2017-2-9�� �滻Ϊ2017-2-1 ������ǰ���滻Ϊ1��
			int max=calendar.getActualMaximum(Calendar.DATE);
			//��ȡ��ǰ�·��������
			System.out.println("��\tһ\t��\t��\t��\t��\t��");
			//��ȡ1�Ŷ�Ӧ�Ǳ��ܵڼ���
			for(int j=1;j<calendar.get(Calendar.DAY_OF_WEEK);j++){
				System.out.print("\t");
			}
			//�˴�������calendar.getActualMaximum(Calendar.DATE),���⺯������������������������ڣ�eg:2.28���2.31
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
