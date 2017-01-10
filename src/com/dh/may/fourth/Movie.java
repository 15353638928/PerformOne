package com.dh.may.fourth;
/**
 * wait释放资源,sleep不释放资源
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
		System.out.println("包子来了");
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
		System.out.println("开吃包子");
		this.notify();
		this.flag = true;
	}

}
