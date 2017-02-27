package com.dh.feb.twentyseven;

import java.util.Arrays;

/**
 * 
 * @author admin-DH
 *
 */
public class ArraySort {
	public static void main(String[] args) {
		int[] a = {12,22,3,6,89,33,11};
		ArraySort(a);
		Arrays.sort(a);
		for(int j:a)
			System.out.println(j);
	}

	private static void ArraySort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=1;i<a.length;i++){
			
			for(int j=1;j<a.length-i;j++){
				
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
