package com.dh.mar.sixth;

public class Node {
	Node previous; //��һ���ڵ㣬�ڵ�����
	Object obj;
	Node next;   //��һ���ڵ㣬�ڵ�����
	public Node(){
		
	}
	public Node(Node previous, Object obj, Node next) {
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
	}
	
}
