package com.dh.feb.Twenty;

public class Factorial {
	
	public static int factorial(int n){
		if(n==1){
			return 1;
		}else{
			return	n*factorial(n-1);
		}
	}
	public static int factorial(double n){
		int c=1;
		for(int i=1;i<=n;i++){
			c=c*i;
		}
		return c;
	}
	public static void main(String[] args) {
		System.out.println(factorial(11));
		System.out.println(factorial(11));
	}

}
