package com.dh.feb.before;

public class Point {
	double x,y,z;
	public Point(double xx,double yy,double zz){
		x=xx;
		y=yy;
		z=zz;
	}
	public void setX(double xx){
		x=xx;
	}
	public static void main(String[] args) {
		Point p1 = new Point(1, 2, 3);
		p1.setX(998);
		System.out.println(p1.x);
	}
}
