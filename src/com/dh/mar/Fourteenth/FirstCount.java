package com.dh.mar.Fourteenth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * map ���ֱ�������
 * @author admin-DH
 *
 */
public class FirstCount {
	public static void main(String[] args) {
		String[] arr = "you are right? you are wrong? you are fin? you are better!".split(" ");
		Map<String, Integer> aMap = new HashMap<String, Integer>();
		for(String key:arr){
			if(!aMap.containsKey(key)){
				aMap.put(key, 1);	
			}else{
				aMap.put(key, aMap.get(key)+1);
			}
		}
		//��һ�֣��ձ�ʹ�ã�����ȡֵ
		System.out.println("ͨ��Map.keySet����key��value��");
		for(String key:aMap.keySet()){
			System.out.println(key+"����:"+aMap.get(key));
		}
		//�ڶ���
		 System.out.println("ͨ��Map.entrySetʹ��iterator����key��value��");
		 Iterator<Map.Entry<String, Integer>> iterator = aMap.entrySet().iterator();
		 while(iterator.hasNext()){
			 Map.Entry<String, Integer> entry = iterator.next();
			 System.out.println("key="+entry.getKey()+"   value="+entry.getValue());
		 }
		//�����֣��Ƽ���������������ʱ
		  System.out.println("ͨ��Map.entrySet����key��value");
		  for(Map.Entry<String, Integer> entry:aMap.entrySet()){
			  System.out.println("key="+entry.getKey()+"   value="+entry.getValue());
		  }
		//������
		  System.out.println("ͨ��Map.values()�������е�value�������ܱ���key");
		  for(Integer integer:aMap.values()){
			  System.out.println(integer);
		  }
	}
}