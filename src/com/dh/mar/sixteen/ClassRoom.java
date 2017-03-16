package com.dh.mar.sixteen;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
	private List<Student> stulist;
	private double total;
	private String no;
	public ClassRoom() {
		stulist = new ArrayList<Student>();
	}
	public ClassRoom(String no) {
		this();
		this.no = no;
	}
	public List<Student> getStulist() {
		return stulist;
	}
	public void setStulist(List<Student> stulist) {
		this.stulist = stulist;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public ClassRoom(List<Student> stulist, double total, String no) {
		super();
		this.stulist = stulist;
		this.total = total;
		this.no = no;
	}
}
