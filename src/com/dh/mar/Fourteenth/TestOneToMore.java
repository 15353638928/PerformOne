package com.dh.mar.Fourteenth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * һ�Զ�ʵ�֣��ּ�洢
 * @author admin-DH
 *
 */
public class TestOneToMore {
	public static void main(String[] args) {
		String[] aStrings = "Big big world i'm a big big girl in a big big world".split(" ");
		Map<String, Integer> maps = new HashMap<String, Integer>();
		for(String arr:aStrings){
			/**
			 * ����һ  ͨ�� ��keyֵ�����ж�
			 */
//			if(!maps.containsKey(arr)){
//				maps.put(arr, 1);
//			}else{
//				maps.put(arr, maps.get(arr)+1);
//			}
			/**
			 * ����ͨ����ȡvalueֵ�ж��Ƿ�Ϊ��
			 */
			Integer value = maps.get(arr);
			if(null==value){
				maps.put(arr,value);
			}else{
				maps.put(arr,maps.get(arr)+1);
			}
		}
		Iterator<String> iterator = maps.keySet().iterator();
		while(iterator.hasNext()){
			String word = iterator.next();
			Integer integer = maps.get(word);
			System.out.println("word-->"+word+"-->integer-->"+integer);
		}
	}
}
