package com.dh.mar.thirteen;

import java.util.List;

/**
 * 非泛型类中定义泛型方法
 * 定义：在返回类型前面加<字母>
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
