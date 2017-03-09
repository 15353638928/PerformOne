package com.dh.mar.ninth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		List<String> lStrings = new ArrayList();
		lStrings.add("good");
		lStrings.add("nice");
		lStrings.add("batter");
		lStrings.add("best");
		System.out.println(lStrings.size());
		Iterator<String>  iterator = lStrings.iterator();
	
		lStrings.addAll(lStrings);
		//lStrings.clear();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println(lStrings.size());
	}
}
