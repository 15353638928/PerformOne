package com.dh.mar.seventh;

import java.util.Date;
import java.util.LinkedList;

import com.dh.mar.sixth.Node;

public class LinkedTest {
	public static void main(String[] args) {
		LinkedList  list =new LinkedList();
		list.add("aaa");
		list.add("bbb");
		list.add("cccc");
		list.add(new Date());
		list.add(new Node());
		System.out.println(list.size());
		System.out.println(list.get(1));
	}
}
