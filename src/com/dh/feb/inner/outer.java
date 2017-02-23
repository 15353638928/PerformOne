package com.dh.feb.inner;

import com.dh.feb.inner.Face.Nose;

public class outer {
	 static String  aString ="good";
	public static void main(String[] args) {
		
		Face n = new Face();
		Nose cNose= n.new Nose();
		System.out.println("aString="+aString);
		n.testface();
	}

}

class Face{
	int type;
	static void testface(){
		System.out.println("æ≤Ã¨∑Ω∑®≤‚ ‘ ");
	}
	class Nose{
		String  type;
		void breath(){
			System.out.println("hu xi!");
		}
	}
}