package com.dh.feb.twentyeight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author admin-DH
 *
 */
public class Collections {
	public static void main(String[] args) {
		List collections = new ArrayList();
		collections.add("well"); 
		collections.add("nihao");
		collections.add("xiaoming");
		collections.add("dabao");
		System.out.println(collections.size());
		System.out.println(collections.contains("pp"));
		System.out.println(collections.indexOf("dabao"));
		
	}
}
