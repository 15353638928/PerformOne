package com.dh.mar.Fourteenth;
/**
 * ͨ���������ʵ�ַּ�洢
 * @author admin-DH
 *
 */
public class Letter {
//�ȴ���ʵ���࣬������IO
	private String name;
	private  int count;
	//��ݼ�  alt+shift+s  -->o
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
	//setter  �� getter ������   ��ݼ�  alt+shift+s -->r -->tab -->enter  -->shift+tab-->enter
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
