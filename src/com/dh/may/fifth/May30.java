package com.dh.may.fifth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class May30 {
	public static void main(String[] args) {
		File  path =  new File("C:/Users/admin-DH/Desktop/feel.txt");
		try {
			FileInputStream aa = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
