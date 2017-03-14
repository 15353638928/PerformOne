package com.dh.mar.thirteen;

/**
 * 泛型父类
 * 1.保留父类泛型-->子类为泛型
 * 2.不保留父类泛型-->子类按需实现
 * 
 * 
 * 属性及方法类型-->随位置而定 （父属父，子属子）
 * 子类重写方法的类型-->随父类而定
 * 子类新增方法的类型-->随子类而定
 * 子类中使用父类的属性-->随父类而定
 * 子类中使用自己的属性-->随子类而定
 * @author admin-DH
 *
 * @param <T1>
 * @param <T2>
 */
public abstract class Father<T1,T2> {
	T1 age;
	public abstract void test(T2 name);
}
//保留-->泛型子类
//全部保留
class C1<T1,T2> extends Father<T1, T2>{

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		
	}}
//部分保留
class C2<T2> extends Father<Integer,T2>{

	@Override
	public void test(T2 name) {
		// TODO Auto-generated method stub
		
	}}
//不保留-->按需实现
//具体类型
class C3<A,B> extends Father<Integer,String>{

	@Override
	public void test(String name) {
		// TODO Auto-generated method stub
		
	}}
//没有类型  擦除（object）
class C4 extends Father{

	@Override
	public void test(Object name) {
		// TODO Auto-generated method stub
		
	}}
