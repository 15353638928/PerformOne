package com.dh.feb.Twenty;

public class ObjectC {
	public ObjectC() {
		super();
		System.out.println("ObjectC");
		// TODO Auto-generated constructor stub
	}
	String a;
}
class ObjectD extends ObjectC{
	public  ObjectD(){
		super();
		System.out.println("ObjectD");
	}
	public  void Run(){
	
		System.out.println("ObjectQQ");
	}
	
}
