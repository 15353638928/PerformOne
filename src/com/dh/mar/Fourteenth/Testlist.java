package com.dh.mar.Fourteenth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * 迭代器报错 NoSuchElementException
 * @author admin-DH
 *
 */
public class Testlist {
	public static void main(String[] args) {
		List<String> lStrings = new ArrayList<String>();
		lStrings.add("1111");
		lStrings.add("2222");
		lStrings.add("3333");
		Iterator<String> iterator = lStrings.iterator();
		while(iterator.hasNext()){		
			System.out.println(iterator.next());
			System.out.println(iterator.next());	
		}
		/**
		 * 从代码看来，迭代器使用两次（取值）;原理：迭代器实现原理，没遍历一次只去一个值，然后游标++，所以在代码里面直接调用两次就会报找不到元素错.
		 */
	}	
}
