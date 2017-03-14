package com.dh.mar.Fourteenth;
/**
 * 通过面向对象实现分拣存储
 * @author admin-DH
 *
 */
public class Letter {
//先创建实体类，即就是IO
	private String name;
	private  int count;
	//快捷键  alt+shift+s  -->o
	public Letter(){
		
	}
	public Letter(String name) {
		super();
		this.name = name;
	}
	public Letter(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	//setter  和 getter 访问器   快捷键  alt+shift+s -->r -->tab -->enter  -->shift+tab-->enter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
