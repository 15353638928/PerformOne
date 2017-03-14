package com.dh.mar.Fourteenth;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author admin-DH
 *
 */
public class TestLetter {
	public static void main(String[] args) {
		String[] aStrings = "Big big world i'm a big big girl in a big big world".split(" ");
		Map<String, Letter> map =  new  HashMap<String, Letter>();
		for(String key:aStrings){
			//方法一
//			if(!map.containsKey(key)){
//				map.put(key, new Letter(key));	
//			}
//			Letter value = map.get(key);
//			value.setCount(value.getCount()+1);
			//方法2
			Letter value = map.get(key);
			if(null==value){
				value = new Letter();
				map.put(key, value);
				System.out.println(value.getCount()+"-->"+value.getName());
			}
			value.setCount(value.getCount()+1);
		}
		 
		for(String key:map.keySet()){
			System.out.println(key+"--->"+map.get(key).getName()+"-->"+map.get(key).getCount());
		}
	}
}
