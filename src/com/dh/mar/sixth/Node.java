package com.dh.mar.sixth;

public class Node {
	Node previous; //上一个节点，节点类型
	Object obj;
	Node next;   //下一个节点，节点类型
	public Node(){
		
	}
	public Node(Node previous, Object obj, Node next) {
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
	}
	
}
