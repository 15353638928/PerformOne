package com.dh.feb.twentyseven;

import java.io.File;

/**
 * �ݹ��ӡĿ¼���ݹ��������ݹ�ͷ���ݹ鷽��
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
			-��ҵ1
			--��ҵ.html
			-��ҵ2
			--11.16����.html
			--DOM.html
		 */
		System.out.println(file.getName());
		/*  1.�ݹ�˼��:
		 * 	2.ͬһ��Ŀ¼���ν���һ��Ŀ¼����ѭ�������벽��2
			2.��Ŀ¼�µ��ļ���Ŀ¼��һ�θ�ֵ��file���飬�ٵ�����2
			4.ѭ��2-3���裬ֱ��û��Ŀ¼�ļ������η����ϲ㣬ֱ������Ŀ¼��ѭ������
		*/
		if(file.isDirectory()){
			File[] files = file.listFiles();
			for(File aFile : files){
				printdirectory(aFile,leavl+1);
			}
		}
	
	}
	
}
