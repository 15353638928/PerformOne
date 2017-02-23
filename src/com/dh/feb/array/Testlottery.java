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
		
		// 例如：红色球号码 01 06 13 19 24 28 蓝色球号码 16
		System.out.println("开始出奖");
		// 定义双色球数组，大小为7
		String[] values = new String[8];
		for (int i = 0; i < 7; i++) {
			String c ="";
			values[i] = localTest1.randomOneBlueValue()+"";
			System.out.println(values[i]);
			
			
		}

		// 打印双色球号码
		for (String value : values) {
			System.out.print(" " + value);
		}
	}
}