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
		ArrayList   �ײ�ʵ�������飬��ѯ�죬��ɾ����   //�̲߳���ȫ��Ч�ʸ�
		LinkedList �ײ�ʵ����������ѯ������ɾ�Ŀ�   //�̲߳���ȫ��Ч�ʸ�
		Vector �̰߳�ȫ��Ч�ʵ� 
	 */
}
