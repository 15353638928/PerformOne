package com.dh.mar.thirteentwo;

import java.util.ArrayList;
import java.util.List;
/**
 *   ?  ͨ���  ���Ͳ�ȷ����ֻ�����ڣ����ͣ��������� | �β���
 *   �����ط�����ʹ�ã����磺�����࣬���͸�ֵ
 * @author admin-DH
 *
 */
public class WildcardsTest {
	public static void main(String[] args) {
		//���������,���п��ұ�. 
		List<?> list = new ArrayList<Integer>();
		list = new ArrayList<String>();
		list = new ArrayList<Object>();
		test(list);
	}
	public static void test(List<?> list){
		
	}
}
