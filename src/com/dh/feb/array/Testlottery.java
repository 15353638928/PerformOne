package com.dh.feb.array;

public class Testlottery {
	private int randomOneBlueValue(){
		int randomValue = (int) (Math.random() * 6 + 1);  
	    return randomValue; 
	}
	private int randomOneRedValue(){
		int randomValue = (int) (Math.random() * 15 + 1);  
	    return randomValue; 
	}

	public static void main(String[] arg) {
		Testlottery localTest1 = new Testlottery();
		
		// ���磺��ɫ����� 01 06 13 19 24 28 ��ɫ����� 16
		System.out.println("��ʼ����");
		// ����˫ɫ�����飬��СΪ7
		String[] values = new String[8];
		for (int i = 0; i < 7; i++) {
			String c ="";
			values[i] = localTest1.randomOneBlueValue()+"";
			System.out.println(values[i]);
			
			
		}

		// ��ӡ˫ɫ�����
		for (String value : values) {
			System.out.print(" " + value);
		}
	}
}