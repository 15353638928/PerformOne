package com.dh.feb.twentysix;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) {
		File f = new File("C:/Users/admin-DH/Pictures/pad照片/001.JPG");
		File f1 = new File("C:/Users");
		File f3 = new File("D:/java");
		
		File f2 = new File(f3,"/Ja/Va/JV");
		f2.mkdirs();
		
		if(f.isFile()){
			System.out.println("是文件");
		}
		if(f1.isDirectory())
				System.out.println("是目录 ");
		System.out.println(f.canRead());
	}

}
