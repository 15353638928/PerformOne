package com.dh.mar.eighth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TesTMap {
	public static void main(String[] args) {
		Map  maplist = new HashMap();
	
		maplist.put("����",new Wife("����"));
		maplist.put("�˸�ѽ·",new Wife("�ҵ���"));
		Wife wife = (Wife) maplist.get("����");
		System.out.println(maplist.size());
		maplist.remove("�˸�ѽ·");
		System.out.println(maplist.size());
		System.out.println(wife.name);
		System.out.println(maplist.containsKey("����"));
		System.out.println(maplist.containsValue(new Wife("�ҵ���")));
		System.out.println(maplist.containsValue("�ҵ���"));
		System.out.println(maplist.get("����"));
		//Iterator  aa = (Iterator) maplist.keySet();
		
		}
}
