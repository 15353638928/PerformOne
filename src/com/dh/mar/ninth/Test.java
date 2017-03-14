package com.dh.mar.ninth;

//List、Map、Set三个接口，存取元素时，各有什么特点
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


