package com.dh.mar.thirteen;
/**
 * 泛型接口
 * 泛型接口不能用在全局变量上 
 * @author admin-DH
 *
 * @param <T>
 */
public interface Comparator<T> {
	/* public static final */int MAX_VALUE = 1024;
	/* public abstract */    T Compare(T t);
}
