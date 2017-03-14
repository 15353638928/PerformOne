package com.dh.mar.thirteentwo;

import java.util.ArrayList;
import java.util.List;
/**
 *   ?  通配符  类型不确定，只能用于（泛型）声明变量 | 形参上
 *   其他地方不能使用，比如：泛型类，泛型赋值
 * @author admin-DH
 *
 */
public class WildcardsTest {
	public static void main(String[] args) {
		//声明看左边,运行看右边. 
		List<?> list = new ArrayList<Integer>();
		list = new ArrayList<String>();
		list = new ArrayList<Object>();
		test(list);
	}
	public static void test(List<?> list){
		
	}
}
