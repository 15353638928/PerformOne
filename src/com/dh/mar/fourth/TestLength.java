package com.dh.mar.fourth;

import java.util.ArrayList;
import java.util.List;

public class TestLength {
	public static void main(String[] args) {
		int a =10;
		int b =10;
		String aString ="yes";
		String bString ="yes";
		if(aString.equals(bString)){
			System.out.println("good");
		}else{
			System.out.println("bad");
		}
		System.out.println(aString.hashCode());
		System.out.println(bString.hashCode());
		List  sss = new ArrayList();
		//sss.remove(1);
		for(int i=10;i>0;i--){
			System.out.println(--i);
		}
		
	}
}
