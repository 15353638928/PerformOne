package com.dh.feb.twentysix;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) {
		File f = new File("C:/Users/admin-DH/Pictures/pad��Ƭ/001.JPG");
		File f1 = new File("C:/Users");
		File f3 = new File("D:/workspace");
		
		File f2 = new File(f3,"998.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(f.isFile()){
			System.out.println("���ļ�");
		}
		if(f1.isDirectory())
				System.out.println("��Ŀ¼ ");
		System.out.println(f.canRead());
	}

}
