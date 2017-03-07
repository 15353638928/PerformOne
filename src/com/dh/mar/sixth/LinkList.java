package com.dh.mar.sixth;

import java.util.Date;



public class LinkList {
	Node first;
	Node last;
	private int size;
	public void add(Object obj) {
	final Node l = last;
    final Node newNode = new Node(last,obj, null);
	    //调用node带参数构造函数
	    last = newNode;
	    if (l == null)
	        first = newNode;
	    else
	    	l.next = newNode;
	    size++;
	}
	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.add("aaa");
		list.add("bbb");
		list.add("cccc");
		list.add(new Date());
		list.add(new Node());
		System.out.println(list.size);
		System.out.println(list.get(10));
	}
	private void rangecheck(int index){
		if(index<0||index>size){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public Object get(int index){
		rangecheck(index);
		Node temp = null;
		if(first!=null){
			temp = first;
//			while(first.getNext()!=null){
//				temp = temp.getNext();
//			}
			for(int i=0;i<index;i++){
				temp = temp.next;
			}
		}
		return temp.obj;
	}
	public int size(){
		return size;
	}
}

