package com.dh.mar.sixth;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LengthoSize {
	public static void main(String[] args) {
		String[] liStrings = {"Nihao","Jintian","Shiba","Meicuo"};
		List list = new ArrayList();
		list.add("hello");
		list.add("buhao");
		list.add(new Date());
		list.add(System.currentTimeMillis());
		System.out.println(liStrings.length);
		System.out.println(liStrings[1].length());
		list.size();
		LinkedList aaa = new LinkedList();
		Iterator aIterator = list.iterator();
		while(aIterator.hasNext()){
			//System.out.println(aIterator.next());
			System.out.println(aIterator.next().toString());
		}
	}

}
