package com.dh.mar.Fourteenth;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * ���������� NoSuchElementException
 * @author admin-DH
 *
 */
public class Testlist {
	public static void main(String[] args) {
		List<String> lStrings = new ArrayList<String>();
		lStrings.add("1111");
		lStrings.add("2222");
		lStrings.add("3333");
		Iterator<String> iterator = lStrings.iterator();
		while(iterator.hasNext()){		
			System.out.println(iterator.next());
			System.out.println(iterator.next());	
		}
		/**
		 * �Ӵ��뿴����������ʹ�����Σ�ȡֵ��;ԭ��������ʵ��ԭ��û����һ��ֻȥһ��ֵ��Ȼ���α�++�������ڴ�������ֱ�ӵ������ξͻᱨ�Ҳ���Ԫ�ش�.
		 */
	}	
}
