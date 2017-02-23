package com.dh.feb.array;

import java.util.ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		int[][] a = {{1,2,5},
				{3,4,7}
		,
		{3,4,7}};
		int[][] b = {{1,2,8},
				{3,4,0}
		,
		{3,4,0}};
		int[][] c = new int[3][3];
		c=arrayadd(a,b);
		show(c);
	}
	public static int[][] arrayadd(int[][] a,int[][] b){
		
		int[][] c = new int[a.length][a.length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
			
		}
		return c;
		
	}
	public static void show(int[][] c){
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++){
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

