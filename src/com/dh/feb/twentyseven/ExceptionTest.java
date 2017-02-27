package com.dh.feb.twentyseven;
/**
 * 异常处理
 * @author admin-DH
 *
 */
public class ExceptionTest {
	public static void main(String[] args) {
		Computer  computer = null;
		computer.start();
	/** 1.java.lang.NullPointerException
	 *  2.80% 对象为空，堆空间没有对象可调用的方法或者属性, eg:computer
	 *  3.解决本例子办法加判断 if(computer!=null)，所以以后代码必须严谨
	 */
	}
}
class Computer{
	void start(){
		System.out.println("start");
	}
}