package com.dh.mar.lastfewdays;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dh.mar.fourth.TestLength;
/**
 *模拟arraylist实现
 * @author admin-DH
 *
 */

public class ArrarylistTest {
	private Object[] elementData;
	private int size;
	public ArrarylistTest(){
		this(10);
	}
	public ArrarylistTest(int initialCapacity){
		rangecheck(initialCapacity);
		elementData = new Object[initialCapacity];
	}
	public ArrarylistTest(int initialCapacity,Object obj){
		rangecheck(initialCapacity);
		elementData = new Object[initialCapacity];
	}
	public void Add(Object obj){
		//实现数据扩容
		
		ensureCapacityInternal(size);
		elementData[size] = obj;
		size++;
		//elementData[size++]=obj;
	}
	public Object get(int index){
		rangecheck(index);
		return elementData[index];
	}
	private void rangecheck(int index){
		if(index<0||index>size){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void remove(int index){
		rangecheck(index);
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(elementData, index+1, elementData, index,
                             numMoved);
        elementData[--size] = null; // clear to let GC do its work,将最后一个元素置空
	}
	public void remove(Object obj){
		for(int i=0;i<size;i++){
			if(get(i).equals(obj)){
				remove(i);
			}
		}
	}
	public Object set(int index,Object obj){
		rangecheck(index);
		Object oldValue = elementData[index];
		elementData[index] = obj;
	    return obj;
	}
	public void Add(int index, Object obj){
		rangecheck(index);
		
		System.arraycopy(elementData, index, elementData, index+1, size-index);
		elementData[index] = obj;
		size++;
	}
	//数组扩容方法 
	public void ensureCapacityInternal(int size){
		if(size==elementData.length){
			Object[] newArray = new Object[size*2+1];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}
	}
	public static void main(String[] args) {
		ArrarylistTest list = new ArrarylistTest();
		list.Add(111);
		list.Add(222);
		list.Add(new Date());
		list.Add(System.currentTimeMillis());
		list.Add(new TestLength());
		//list.Add(555);
		list.Add(1, "nihaome");
		for(int i=0;i<list.size;i++)
		System.out.println(list.get(i));
		list.set(3, 1001);
		//list.remove(1);
		System.out.println("hhhhhhhhhhhhhhhhhhhhh");
		for(int i=0;i<list.size;i++)
			System.out.println(list.get(i));
	}
	
	
}
