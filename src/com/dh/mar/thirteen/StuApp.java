package com.dh.mar.thirteen;

public class StuApp<T> {
	private T name;
	public StuApp(){
		
	}
	public StuApp(T name){
		this.name = name;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	

}
