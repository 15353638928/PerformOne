package com.dh.mar.thirteen;

import com.dh.feb.before.Student;

/**����:���Ͳ�����ָ�ڼ̳�(ʵ��)��ʹ��ʱû��ָ�����������
 * 
 */
public class MyStudent {
	public static void main(String[] args) {
		//����-->û��ָ��  ���͵ľ�������
		StuApp app = new StuApp();	
		app.setName(100);//100-->int -->integer
		Object object = app.getName();
		test(app);//���벻�����ͼ��
		/**
		 * ������Object��������boject
		StuApp<Object> app2 = new StuApp<Object>();
		test(app2);    
		 */
	}

	public  static void test(StuApp<Integer> stu){
		
	}
}
