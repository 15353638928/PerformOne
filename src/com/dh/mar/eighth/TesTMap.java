package com.dh.mar.eighth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TesTMap {
	public static void main(String[] args) {
		Map  maplist = new HashMap();
	
		maplist.put("你妹",new Wife("哈怂"));
		maplist.put("八嘎呀路",new Wife("我的神"));
		Wife wife = (Wife) maplist.get("你妹");
		System.out.println(maplist.size());
		maplist.remove("八嘎呀路");
		System.out.println(maplist.size());
		System.out.println(wife.name);
		System.out.println(maplist.containsKey("你妹"));
		System.out.println(maplist.containsValue(new Wife("我的神")));
		System.out.println(maplist.containsValue("我的神"));
		System.out.println(maplist.get("你妹"));
		//Iterator  aa = (Iterator) maplist.keySet();
		
		}
}
