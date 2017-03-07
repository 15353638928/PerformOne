package com.dh.mar.sixth;

public class Node {
	Node previous; //上一个节点，节点类型
	private Object obj;
	Node next;   //下一个节点，节点类型
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Node(){
		
	}
	public Node(Node previous, Object obj, Node next) {
		super();
		this.previous = previous;
		this.obj = obj;
		this.next = next;
	}
	
}
