package com.dh.feb.twentyseven;

import java.io.File;

/**
 * 递归打印目录，递归条件：递归头、递归方法
 * @author admin-DH
 *
 */
public class FileTest {

	public static void main(String[] args) {
		printdirectory(new File("D:/java/Ja/Va/JV"),0);
	}
	static void printdirectory(File file ,int leavl){
		
		for(int i=0;i<leavl;i++){
			System.out.print("-");
		}
		/*The follow is result of the program
		 * 	JV
			-11.16.html
			-11.21.html
			-作业1
			--作业.html
			-作业2
			--11.16数组.html
			--DOM.html
		 */
		System.out.println(file.getName());
		/*  1.递归思想:
		 * 	2.同一级目录依次进入一个目录进行循环，进入步骤2
			2.将目录下的文件和目录再一次赋值给file数组，再到步骤2
			4.循环2-3步骤，直至没有目录文件，依次返回上层，直到顶层目录，循环结束
		*/
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(File aFile : files){
				printdirectory(aFile,leavl+1);
			}
		}
	
	}
	
}
