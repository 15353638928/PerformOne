package com.dh.mar.thirteen;

import java.util.List;

/**
 * �Ƿ������ж��巺�ͷ���
 * ���壺�ڷ�������ǰ���<��ĸ>
 * @author admin-DH
 *
 */
public class Method {
	public static <T> void test(T t){
		System.out.println(t);
	}
	public static <T extends List> void test(T t){
		System.out.println(t.add("hhhh"));
	}
	public static void main(String[] args) {
		test("nihao");
	}
}
