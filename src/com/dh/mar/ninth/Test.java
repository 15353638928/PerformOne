package com.dh.mar.ninth;

//List��Map��Set�����ӿڣ���ȡԪ��ʱ������ʲô�ص�
import java.util.*;
public class Test{
	public static void main(String [] arge)
	{
	List list = new ArrayList();
	list.add(0, "a");
	list.add(1, "b");
	list.add(2, "c");
	list.add(3, "d");
	Iterator it = list.iterator();
	while(it.hasNext())
	{
	   Object element = it.next();
	   System.out.println (element);
	}
	}
}


