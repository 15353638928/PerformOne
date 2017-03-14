package com.dh.mar.thirteen;
/**
 * 泛型接口 与 泛型类 同理 
 * @author admin-DH
 *
 * @param <T>
 */
public interface CompareT<T> {
	//接口只包含抽象方法和全局常量
	public static final int MAX_VALUE=0;
	//公共抽象方法
	public abstract void test(T t);
}
class InterC1<A> implements CompareT{
/**定义:泛型擦除是指在继承(实现)或使用时没有指定具体的类型
 * 特点：一旦擦除之后按Object处理（依然存在警告，加上Object可以去除
 * 的那是有写画蛇添足。不完全等于Object，编译不会类型检查）
 * 例如InterC1<A> 实现CompareT 接口
 */
	@Override
	public void test(Object t) {
		// TODO Auto-generated method stub
		
	}
}
class InterC2<A> implements CompareT<Integer>{

	@Override
	public void test(Integer t) {
		// TODO Auto-generated method stub
		
	}
}
class interC3<T,A> implements CompareT<T>{

	@Override
	public void test(T t) {
		// TODO Auto-generated method stub
		
	}
}
