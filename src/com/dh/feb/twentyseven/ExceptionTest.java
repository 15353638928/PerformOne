package com.dh.feb.twentyseven;
/**
 * �쳣����
 * @author admin-DH
 *
 */
public class ExceptionTest {
	public static void main(String[] args) {
		Computer  computer = null;
		computer.start();
	/** 1.java.lang.NullPointerException
	 *  2.80% ����Ϊ�գ��ѿռ�û�ж���ɵ��õķ�����������, eg:computer
	 *  3.��������Ӱ취���ж� if(computer!=null)�������Ժ��������Ͻ�
	 */
	}
}
class Computer{
	void start(){
		System.out.println("start");
	}
}