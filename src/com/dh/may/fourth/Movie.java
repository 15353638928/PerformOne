package com.dh.may.fourth;
/**
 * wait�ͷ���Դ,sleep���ͷ���Դ
 * @author admin-DH
 *
 */
public class Movie {
	
	private String pic;
	private boolean flag = true;
	public synchronized void play(String pic){
		if(!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.pic = pic;
		System.out.println("��������");
		this.notify();
		this.flag = false;
		
	}
	public synchronized void watch(){
		if(flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pic);
		System.out.println("���԰���");
		this.notify();
		this.flag = true;
	}

}
