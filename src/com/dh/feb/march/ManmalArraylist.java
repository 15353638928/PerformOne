package com.dh.feb.march;
/**
 * Manual achieve arraylist
 * @author admin-DH
 *
 */
public class ManmalArraylist {
	
	private Object[] elementData;
	private int size;
	
	public ManmalArraylist(){
		this(10);
	}
	public ManmalArraylist(int initialCapacity){
		if(initialCapacity<0){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		elementData = new Object[initialCapacity];
	}
}
