package com.dh.mar.sixth;

import java.util.Date;

public class LinkList {
	private static final Object Object = null;
	private Node first;
	private Node last;
	private int size;
	public static void main(String[] args) {
		LinkList list = new LinkList();
		list.add("aaa");
		list.add("bbb");
		list.add("cccc");
		list.add(new Date());
		list.add(new Node());
		System.out.println(list.size);
		//System.out.println(list.get(1));
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
		return temp.getObj();
	}
	private void add(Object obj) {
		Node n = new Node();
		if(first==null){
			//�����һ��Ϊ�գ���ô��ûԪ�أ���һ�������һ���غ�
			n.previous=null;
			n.setObj(obj);
			n.next=null;
			first = n;
			last = n;
		}else{
			n.previous=last;
			n.setObj(obj);
			n.next=null;
			last = n;
		}
		size++;
	}
	public int size(){
		return size;
	}
}

