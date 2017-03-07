package com.dh.feb.march;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * @author admin-DH
 *
 */
public class First {
	public static void main(String[] args) {
		List  list1 = new ArrayList();
		List  list = new LinkedList<>();
		
		list.add("aaa");
		list.add(new Date());
		list.add(System.currentTimeMillis());
		list.add(123456);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		List list2 = new ArrayList<>();
		list2.add("goo");
		list2.add(list);
		list2.add("aaa");
		list2.add(2, 123);
		System.out.println(list2.size());
		System.out.println(list.get(1));
		System.out.println(list2.get(1));
		System.out.println(list2.indexOf("goo"));
	}
	/**
		ArrayList   底层实现是数组，查询快，增删改慢   //线程不安全，效率高
		LinkedList 底层实现是链表，查询慢，增删改快   //线程不安全，效率高
		Vector 线程安全，效率低 
	 */
}
